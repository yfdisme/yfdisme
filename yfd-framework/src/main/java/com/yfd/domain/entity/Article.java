package com.yfd.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (Article)实体类
 *
 * @author makejava
 * @since 2022-10-12 10:17:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("yfd_article")
public class Article implements Serializable {
    private static final long serialVersionUID = 909872070803486233L;
    
    private Long id;
    /**
     * 标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 文章摘要
     */
    private String summary;
    /**
     * 所属分类id
     */
    private Long categoryId;
    /**
     * 缩略图
     */
    private String thumbnail;
    /**
     * 是否置顶（0否，1是）
     */
    private String isTop;
    /**
     * 状态（0已发布，1未发布）
     */
    private String status;
    
    private Long createBy;
    
    private Date createTime;
    
    private Long updateBy;
    
    private Date updateTime;
    
    private Integer delFlag;
}

