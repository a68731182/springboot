package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class User implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "ID", type = IdType.AUTO)
      private Long id;

      /**
     * 姓名
     */
      @TableField("NAME")
    private String name;

      /**
     * 性别
     */
      @TableField("SEX")
    private String sex;

      /**
     * 年龄
     */
      @TableField("AGE")
    private String age;

      /**
     * 身高
     */
      @TableField("LENGTH")
    private String length;

    @TableField("WEIGHT")
    private String weight;

    @TableField("BMI")
    private String bmi;


}
