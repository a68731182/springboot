package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    UserMapper userMapper;

    //执行主方法
    public void mainMethod() throws IOException, BiffException {
        String file ="E:\\aa.xls";
        List excelList=getExcelData(file);
        batchInsert(excelList);
    }


    //获取表格数据
    public List getExcelData(String file) throws IOException, BiffException {
        //容器准备
        List list = new ArrayList();
        String[] key= {"name","sex","age","length","weight","bmi"};
        //文件读取存储
        Workbook data =Workbook.getWorkbook(new File(file));
        Sheet sheet=data.getSheet(0);
        int column=sheet.getColumns();//列
        int row=sheet.getRows();//行
        System.out.println("excel文件的列:"+column+"行:"+row);
        for (int i = 1; i <row; i++) {
            Map map = new HashMap();
            for (int j = 0; j <column; j++) {
                String a=sheet.getCell(j,i).getContents();
                map.put(key[j],a);
            }
            list.add(map);
        }
        return list;
    }

     public List method(){
         List list=userMapper.query();
         return list;
     }
     //批量插入
     public void batchInsert(List list){
         userMapper.batchInsert(list);
     }
}
