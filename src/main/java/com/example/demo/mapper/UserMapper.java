package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */

public interface UserMapper extends BaseMapper<User> {

   List query();

   void batchInsert(List list);


}
