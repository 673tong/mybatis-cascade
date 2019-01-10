package com.kisen.dao;

import com.kisen.entity.User;
import com.kisen.mapper.TkMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper extends TkMapper<User> {
    List<User> getAllUser();

    List<HashMap<String, Object>> getDepById(HashMap<String, Object> param);

}
