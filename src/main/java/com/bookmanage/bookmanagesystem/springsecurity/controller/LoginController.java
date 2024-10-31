package com.bookmanage.bookmanagesystem.springsecurity.controller;
import com.bookmanage.bookmanagesystem.springsecurity.pojo.LoginParams;
import com.bookmanage.bookmanagesystem.springsecurity.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    public String Login(@RequestBody LoginParams loginParams){
        System.out.println(loginParams.getLoginParams().getUserName());
        if(loginService.Login(loginParams.getLoginParams().getUserName()))return "登录成功"+loginParams.getLoginParams().getUserName();
        return "登录失败";
    }
    @PostMapping("/login/a")
    public String Login(String username,String password){
        if(username.equals(password))return "登录成功";
        return "登录失败";
    }


}
