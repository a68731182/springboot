package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@RestController
@RequestMapping(value = "/user",method = RequestMethod.POST) //请求路径
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/list")
    public List list(){
     return this.userService.list();
    }
    @GetMapping("/initlist")
    public List initlist(){
        return (List) this.userService.method();
    }
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return this.userService.removeById(id);
    }


}

