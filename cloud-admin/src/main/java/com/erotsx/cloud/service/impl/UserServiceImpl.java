package com.erotsx.cloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.erotsx.cloud.entity.User;
import com.erotsx.cloud.service.UserService;
import com.erotsx.cloud.mapper.UserMapper;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




