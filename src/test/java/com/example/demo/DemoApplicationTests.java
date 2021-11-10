package com.example.demo;

import com.example.demo.service.UserService;
import jxl.read.biff.BiffException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        System.out.println("测试方法1:-----------------------------");
        userService.method();
    }
    @Test
    public void test1() throws IOException, BiffException {
        System.out.println("数据批量入库");
        userService.mainMethod();
    }
    @Test
    public void test2() throws IOException, BiffException {
        System.out.println("测试3");
    }
}
