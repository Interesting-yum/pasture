package com.example.pasture.utils;

import com.example.pasture.exception.ErrorCodeEnum;
import com.example.pasture.exception.ProjectException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author dingjiasheng@sinoiov.com
 * @description redis锁服务
 * @date 2019/10/1 16:35
 **/
@Slf4j
@Component
public class RedisLockUtil {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * eg
     */
    public void testLock(String key, String value, long time, TimeUnit timeUnit) {
        getLock(key, value, time, timeUnit);
    }

    /**
     * 获取锁实例
     *
     * @param key      key
     * @param value    value
     * @param time     时间长度
     * @param timeUnit 时间单位
     * @throws ProjectException
     */
    private void getLock(String key, String value, long time, TimeUnit timeUnit) throws ProjectException {
        try {
            Boolean lockFlag = redisTemplate.opsForValue().setIfAbsent(key, value, time, timeUnit);
            if (Objects.isNull(lockFlag)) {
                log.error("redis: current key not exist! key->{}", key);
                throw new ProjectException(ErrorCodeEnum.BUSINESS_FREQUENT_ERROR);
            }
            if (!lockFlag) {
                log.error("redis: current key at work! key->{}", key);
                throw new ProjectException(ErrorCodeEnum.BUSINESS_FREQUENT_ERROR);
            }
        } catch (ProjectException e) {
            log.error("redis: current key request is frequent! key->{}", key, e);
            throw new ProjectException(ErrorCodeEnum.BUSINESS_FREQUENT_ERROR);
        } catch (Exception e) {
            log.error("redis:redis is error! key->{}", key, e);
            throw new ProjectException(ErrorCodeEnum.SYSTEM_ERROR);
        }
    }

}
