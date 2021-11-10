package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2021-07-27
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Bmi implements Serializable {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
        @TableId(value = "ID", type = IdType.AUTO)
      private Long id;

      /**
     * 范围
     */
      @TableField("RANGE")
    private String range;

      /**
     * 健康状态
     */
      @TableField("STATUS")
    private String status;


}
