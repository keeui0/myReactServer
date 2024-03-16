package com.example.myhome_project.api.domain;

import lombok.Data;

@Data
public class UserVo {
    private String userId;
    private String userPw;
    private String userName;
    private String userAdd;
    private String userPhone;
    private String userEmail;
    private String createDate;
    private String updateDate;
    private String deleteDate;

}
