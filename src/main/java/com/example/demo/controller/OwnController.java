package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/OwnController",method = RequestMethod.GET)
public class OwnController {

    @Autowired
    private UserService userService;

    //  路径path:  http://localhost:8085/OwnController/getUser
    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    public List GetUser() {
        System.out.println("1111");
        return this.userService.list();
    }
        //  路径path:  http://localhost:8085/OwnController/delete
    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public boolean delete() {
        boolean result = this.userService.removeById("1");
        if (result ==true) {
            return true;
        } else {
            return false;
        }
    }

}


