package com.bookmanage.bookmanagesystem.springsecurity.pojo;

import lombok.Data;
@Data
public class LoginParams {
    private LoginInfo loginParams;
    @Data
    public static class LoginInfo {
        private String UserName;
        private String PassWord;
    }
}
