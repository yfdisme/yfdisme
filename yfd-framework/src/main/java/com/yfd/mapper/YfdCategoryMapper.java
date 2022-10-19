package com.yfd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yfd.domain.entity.YfdCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (YfdCategory)表数据库访问层
 *
 * @author makejava
 * @since 2022-10-15 19:22:23
 */
@Mapper
public interface YfdCategoryMapper extends BaseMapper<YfdCategory> {

     /** 
        * 
        * @param yfdCategory 实例对象
        * @author makejava  
        * @description  分页查询数据
        * @date 2022-10-15 19:22:23
        * @return 实例对象
     */
    List<YfdCategory> selectYfdCategoryList(YfdCategory yfdCategory);
}
