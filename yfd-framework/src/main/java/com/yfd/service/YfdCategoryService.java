package com.yfd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yfd.domain.dto.YfdCategoryDto;
import com.yfd.domain.entity.YfdCategory;

import java.util.List;

/**
 * (YfdCategory)表服务接口
 *
 * @author makejava
 * @since 2022-10-15 19:22:25
 */
public interface YfdCategoryService extends IService<YfdCategory> {

    /** 
     * 
     * @param id 主键
     * @author makejava  
     * @description  通过ID查询单条数据
     * @date 2022-10-15 19:22:25
     * @return 实例对象
     */
    public YfdCategory selectYfdCategoryById (Long id);
        
    /** 
     * 
     * @param yfdCategorydto 实例对象
     * @author makejava  
     * @description 分页查询数据
     * @date 2022-10-15 19:22:25
     * @return 实例对象
     */
    public List<YfdCategory> findYfdCategorySelectList (YfdCategoryDto yfdCategorydto);
    
    
   /** 
     * 
     * @param yfdCategorydto 实例对象
     * @author makejava  
     * @description  新增数据
     * @date 2022-10-15 19:22:25
     * @return 实例对象
     */
    public int insert(YfdCategoryDto yfdCategorydto);
    
   /** 
     * 
     * @param yfdCategorydto 实例对象
     * @author makejava  
     * @description 修改数据并返回
     * @date 2022-10-15 19:22:25
     * @return 实例对象
     */
    public int update(YfdCategoryDto yfdCategorydto);
    
    
    /**
     *
     * @param ids 主键
     * @author makejava 
     * @description  通过主键删除数据
     * @date 2022-10-15 19:22:25
     * @return
     */
    public int deleteById(List<Long> ids);
}
