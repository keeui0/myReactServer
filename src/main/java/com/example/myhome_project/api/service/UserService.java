package com.example.myhome_project.api.service;

import com.example.myhome_project.api.domain.UserInfo;
import com.example.myhome_project.api.repository.UserInfoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserInfoRepository userInfoRepository;

    public UserService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public String join(UserInfo userInfo){
        validateDulicateUserInfo(userInfo);
        userInfoRepository.save(userInfo);
        return userInfo.getId();
    }

    private void validateDulicateUserInfo(UserInfo userInfo) {
        userInfoRepository.findByEmail(userInfo.getEmail())
                .ifPresent(m -> {
                    try {
                        throw new IllegalAccessException("중복");
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
    public List<UserInfo> findUserInfos() {return userInfoRepository.findAll();}

    public Optional<UserInfo> findOne(String userInfoId){
        return userInfoRepository.findById(userInfoId);
    }
}
