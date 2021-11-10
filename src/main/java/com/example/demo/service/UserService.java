package com.example.demo.service;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import jxl.read.biff.BiffException;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Service
public interface UserService extends IService<User> {
   public void mainMethod() throws IOException, BiffException;
   public List  method();
}
