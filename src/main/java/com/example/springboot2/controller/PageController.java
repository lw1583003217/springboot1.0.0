package com.example.springboot2.controller;

import com.example.springboot2.dao.UserMapper;
import com.example.springboot2.domain.User;
import com.example.springboot2.domain.vedio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RestController
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class PageController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/page")
    public String page3(Model model){
        model.addAttribute("userName","张三");
        return "hello";
    }
    @RequestMapping("info/more")
    public String page2(){
        return "hello2";
    }

    @RequestMapping("sys/index")
    public String page(){
        return "sys/index";
    }



    @RequestMapping("/localtest")
    public List<User> localtest(){
        List<User> user = userMapper.selectUser();
        return user;
    }

    @RequestMapping("/cscs")
    public List<vedio> vedioss(){
        List<vedio> vedios = userMapper.selectVedio();
        return vedios;
    }
}