package com.bookmanage.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bookmanage.domain.TbUser;
import com.bookmanage.service.TbUserService;
import com.bookmanage.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

/**
* @author 33099
* @description 针对表【tb_user(用户信息表)】的数据库操作Service实现
* @createDate 2025-04-11 18:29:01
*/
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser>
    implements TbUserService{

}




