package com.bookmanage.bookmanagesystem.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Slf4j
@Configuration
public class Configration {
    @Bean
    public Integer method(){
        //第三方bean
        log.info("第三方bean");
        return null;
    }
}
