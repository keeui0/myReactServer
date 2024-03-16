package com.example.myhome_project;

import com.example.myhome_project.api.domain.UserInfo;
import com.example.myhome_project.api.domain.UserVo;
import com.example.myhome_project.api.repository.UserInfoRepository;
import com.example.myhome_project.api.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Optional;

@Configuration
public class SpringConfig {
    @Bean
    public UserService userService(){
            return new UserService(UserInfoRepository)
    }

    @Bean
    public UserInfoRepository userInfoRepository(){
        return new UserInfoRepository() {
            @Override
            public UserInfo save(UserInfo userInfo) {
                return null;
            }

            @Override
            public Optional<UserInfo> findById(String userId) {
                return Optional.empty();
            }

            @Override
            public Optional<UserInfo> findByName(String userName) {
                return Optional.empty();
            }

            @Override
            public Optional<UserInfo> findByEmail(String userEmail) {
                return Optional.empty();
            }

            @Override
            public List<UserInfo> findAll() {
                return null;
            }

            @Override
            public List<UserVo> select() {
                return null;
            }
        };
    }
}
