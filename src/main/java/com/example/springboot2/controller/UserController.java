package com.example.springboot2.controller;

import com.example.springboot2.dao.UserMapper;
import com.example.springboot2.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.springboot2.domain.vedio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//证明是controller层并且返回json
@RestController
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class UserController {
    //依赖注入
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public List<vedio> cs() {
        //调用dao层
        List<vedio> vedios = userMapper.selectVedio();
        return vedios;
    }
}
