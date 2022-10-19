package com.yfd.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("yfd_category")
/**
 * (YfdCategory)实体类
 *
 * @author makejava
 * @since 2022-10-15 19:22:24
 */
public class YfdCategory implements Serializable {
    private static final long serialVersionUID = 770129242231090613L;
    
    private Long id;
    /**
     * 分类名
     */
    private String name;
    /**
     * 父分类id，没有父分类默认为-1
     */
    private Long pid;
    /**
     * 文章标签描述
     */
    private String desc;
    /**
     * 状态（0正常，1禁用）
     */
    private String status;
    
    private Long createBy;
    
    private Date createTime;
    
    private Long updateBy;
    
    private Date updateTime;
    
    private Integer delFlag;


}

