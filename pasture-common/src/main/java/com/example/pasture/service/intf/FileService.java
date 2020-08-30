package com.example.pasture.service.intf;

import java.util.List;
import com.example.pasture.model.Do.File;
import com.baomidou.mybatisplus.extension.service.IService;
public interface FileService extends IService<File>{


    int updateBatch(List<File> list);

    int updateBatchSelective(List<File> list);

    int batchInsert(List<File> list);

}
