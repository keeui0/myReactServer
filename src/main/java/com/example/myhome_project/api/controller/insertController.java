package com.example.myhome_project.api.controller;

import com.example.myhome_project.api.domain.UserVo;
import com.example.myhome_project.api.service.insertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class insertController {
    @Autowired
    private insertService insertService;

    @GetMapping("select")
    public List<UserVo> getSelectList(){
        return insertService.select();
    }

    @GetMapping("insert")
    public void insertUserVo(){
        UserVo vo = new UserVo();
        vo.setUserId("test1");
        vo.setUserPw("1234");
        vo.setUserName("가나다");
        vo.setUserPhone("010-3333-1111");
        vo.setUserEmail("farmer1590@gmail.com");
        vo.setCreateDate("");
        vo.setUpdateDate("");
        vo.setDeleteDate("");
    }

    @PostMapping("/insert")
    public String insert(String userId, String userPw, String userName,
                         String useradd, String userPhone, String userEmail
                         ,String createDate, String updateDate, String deleteDate){
        String sql = "insert into usermaster (userid, userpw, username, useradd, userphone, useremail,createdate) " +
                "value ('test1','password1234','기의찬','경기도 부천시 길주로 573번길 37(여월휴먼시아 3단지 307동 205호',  " +
                "'010-5713-8825','farmer1212@naver.com',DATE_FORMAT(now(), '%Y-%m-%d %H:%i:%s'))";

        Object[] params = {userId, userPw, userName, useradd, userPhone, userEmail
        ,createDate,updateDate, deleteDate};

        insertService.update(sql, params);

        System.out.println("Post Called");
        return "menu/insert";
    }
}
