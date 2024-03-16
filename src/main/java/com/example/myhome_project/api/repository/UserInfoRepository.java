package com.example.myhome_project.api.repository;

import com.example.myhome_project.api.domain.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserInfoRepository {
    /*User selectUser(User user);*/
    //회원가입
    UserInfo save(UserInfo userInfo);
    //id를 이용한 사용자 조회
    Optional<UserInfo> findById(String userId);
    //name을 이용한 사용자 조회
    Optional<UserInfo> findByName(String userName);
    //email을 이용한 사용자 조회
    Optional<UserInfo> findByEmail(String userEmail);
    //모든 사용자 조회
    List<UserInfo> findAll();

    List<com.example.myhome_project.api.domain.UserVo> select();
}
