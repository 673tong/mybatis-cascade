package com.kisen.dao;


import com.kisen.entity.CollectTask;
import com.kisen.entity.User;
import com.kisen.mapper.TkMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 采集任务
 */
@Mapper
public interface CollectTaskMapper extends TkMapper<CollectTask> {

    List<CollectTask> getAllCollectTask(HashMap<String, Object> param);

    User getUserById(HashMap<String, Object> param);

}
