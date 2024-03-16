package com.example.myhome_project.api.service;

import com.example.myhome_project.api.repository.insertMapper;
import com.example.myhome_project.api.domain.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class insertService {
    @Autowired
    private insertMapper mapper;

    public List<UserVo> select(){
    return mapper.select();
    }

    public void insert(UserVo vo){
        mapper.insert();
    }

    Map<String, Object> update = new HashMap<>();

    public void update(String sql, Object[] params) {
    }
}
