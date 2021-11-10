package com.example.demo.service.impl;

import com.example.demo.entity.Bmi;
import com.example.demo.mapper.BmiMapper;
import com.example.demo.service.BmiService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Service
public class BmiServiceImpl extends ServiceImpl<BmiMapper, Bmi> implements BmiService {

}
