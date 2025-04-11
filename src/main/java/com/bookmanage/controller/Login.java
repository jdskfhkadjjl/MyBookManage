package com.bookmanage.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bookmanage.Dto.LoginDTO;
import com.bookmanage.Utils.ActionResult;
import com.bookmanage.domain.TbUser;
import com.bookmanage.service.TbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "登录接口")
@Slf4j
@RestController
public class Login {
    @Autowired
    private TbUserService tbUserService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public ActionResult login(@ApiParam("用户参数") @RequestBody LoginDTO loginDTO){
        log.info("username:\t"+loginDTO.getUsername()+"password:\t"+loginDTO.getPassword());
        //验证
        LambdaQueryWrapper<TbUser> queryWrapper=new LambdaQueryWrapper<>();
        queryWrapper.eq(TbUser::getName,loginDTO.getUsername());
        List<TbUser> list=tbUserService.list(queryWrapper);
        if(list.isEmpty()){
            throw new RuntimeException("用户不存在");
        }
        if(!loginDTO.getPassword().equals(list.get(0).getPassword())){
            throw new RuntimeException("密码错误");
        }
        return ActionResult.success();
    }
}
