package com.yfd.domain.dto;

import java.time.LocalDateTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * (YfdCategory)实体类
 *
 * @author makejava
 * @since 2022-10-15 19:22:29
 */
@Data
public class YfdCategoryDto {

                
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
        
    List<Long> ids;
    /**
    * 页
    */
    private Integer pageNum;
    /**
    * 条
    */
    private Integer pageSize;
    /**
    * 开始时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    /**
    * 结束时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    
    public Integer getPageNum() {
        return pageNum == null ? 1 : pageNum;
    }

    public Integer getPageSize() {
        return pageSize == null ? 10 : pageSize;
    }
}
