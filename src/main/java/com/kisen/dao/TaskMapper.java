package com.kisen.dao;


import com.kisen.entity.Task;
import com.kisen.entity.User;
import com.kisen.mapper.TkMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * 采集任务
 */
@Mapper
public interface TaskMapper extends TkMapper<Task> {

    List<Task> getAllCollectTask(HashMap<String, Object> param);

    User getUserById(HashMap<String, Object> param);

}
