package cn.stu.service.impl;

import cn.stu.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public void sayHello() {
        System.out.println("say hello world!");
    }

}
