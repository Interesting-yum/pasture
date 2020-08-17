create table data
(
    id               int           not null
        primary key,
    data_name        varchar(50)   null,
    data_type        varchar(20)   null,
    data_level       int           null,
    data_content     varchar(1000) null,
    data_remark      varchar(1000) null,
    data_record_time datetime      null,
    data_operator    int           null
);

create table equipment
(
    id                         int auto_increment
        primary key,
    equipment_name             varchar(50)   null,
    equipment_interface        varchar(50)   null,
    equipment_material         varchar(50)   null,
    equipment_inner_address    varchar(50)   null,
    equipment_physical_address varchar(50)   null,
    equipment_inner_value      varchar(50)   null,
    equipment_isonline         int           null,
    equipment_factoryinfo      varchar(500)  null,
    equipment_remark           varchar(1000) null,
    equipment_record_time      datetime      null,
    equipment_operator         int           null
);

create table file
(
    id               int auto_increment
        primary key,
    file_name        varchar(100)  null,
    file_type        varchar(255)  null,
    file_size        int           null,
    file_url         varchar(100)  null,
    file_data        blob          null,
    file_remark      varchar(1000) null,
    file_record_time datetime      null,
    file_operator    int           null
);

create table livestock
(
    id                    int auto_increment
        primary key,
    livestock_name        varchar(50)   null,
    livestock_type        int           null,
    livestock_weight      double        null,
    livestock_height      double        null,
    livestock_length      double        null,
    livestock_varieties   varchar(255)  null,
    livestock_gender      int           null,
    livestock_age         int           null,
    livestock_birthday    date          null,
    livestock_remark      varchar(1000) null,
    livestock_record_time datetime      null,
    livestock_operator    int           null
);

create table pasture
(
    id                  int auto_increment
        primary key,
    pasture_name        varchar(50)   null,
    pasture_range       varchar(50)   null,
    pasture_quality     varchar(50)   null,
    pasture_lng         varchar(50)   null,
    pasture_lat         varchar(50)   null,
    pasture_remark      varchar(1000) null,
    pasture_record_time datetime      null,
    pasture_operator    int           null
);

create table relation
(
    id                   int auto_increment
        primary key,
    relation_main        varchar(50)   null,
    relation_main_id     int           null,
    relation_second      varchar(50)   null,
    relation_second_id   int           null,
    relation_remark      varchar(1000) null,
    relation_record_time datetime      null,
    relation_operator    int           null
);

create table user
(
    id                int auto_increment
        primary key,
    user_name         varchar(50)   null,
    user_weixin       varchar(50)   null,
    user_account      varchar(50)   null,
    user_password     varchar(50)   null,
    user_phone        varchar(20)   null,
    user_jurisdiction varchar(50)   null,
    user_remark       varchar(1000) null,
    user_record_time  datetime      null,
    user_operator     int           null
);

create table vaccines
(
    id                      int auto_increment
        primary key,
    vaccines_name           varchar(50)   null,
    vaccines_type           int           null,
    vaccines_dose           int           null,
    vaccines_specifications varchar(255)  null comment '规格',
    vaccines_time           datetime      null,
    vaccines_remark         varchar(1000) null,
    vaccines_record_time    datetime      null,
    vaccines_operator       varchar(255)  null
);

create table video
(
    id                int auto_increment
        primary key,
    video_name        varchar(50)   null,
    video_interface   varchar(50)   null,
    video_url         varchar(50)   null,
    video_size        int           null,
    video_isonline    int           null,
    video_factoryinfo varchar(500)  null,
    video_remark      varchar(1000) null,
    video_record_time datetime      null,
    video_operator    int           null
);

