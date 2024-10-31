package com.bookmanage.bookmanagesystem.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bookmanage.bookmanagesystem.springsecurity.mapper.userMapper;

@Service
public class LoginService {
    @Autowired
    private userMapper usermapper;
    public boolean Login(String username){
        if(usermapper.Login(username).size()!=0){
            return true;
        }
        return false;
    }
}
