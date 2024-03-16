package com.example.myhome_project.api.repository;

import com.example.myhome_project.api.domain.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface insertMapper {
    List<UserVo> select();
    void insert();

    void update();
}
