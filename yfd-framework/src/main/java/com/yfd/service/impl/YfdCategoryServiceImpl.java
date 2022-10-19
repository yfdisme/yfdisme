package com.yfd.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.yfd.mapper.YfdCategoryMapper;
import com.yfd.domain.dto.YfdCategoryDto;
import com.yfd.domain.entity.YfdCategory;
import com.yfd.service.YfdCategoryService;
import org.springframework.stereotype.Service;


import java.util.List;

import lombok.RequiredArgsConstructor;


/**
 * (YfdCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-10-15 19:22:28
 */
@Service("yfdCategoryService")
@RequiredArgsConstructor
public class YfdCategoryServiceImpl extends ServiceImpl<YfdCategoryMapper, YfdCategory> implements YfdCategoryService {
    @Override
    public YfdCategory selectYfdCategoryById(Long id) {
        return null;
    }

    @Override
    public List<YfdCategory> findYfdCategorySelectList(YfdCategoryDto yfdCategorydto) {
        return null;
    }

    @Override
    public int insert(YfdCategoryDto yfdCategorydto) {
        return 0;
    }

    @Override
    public int update(YfdCategoryDto yfdCategorydto) {
        return 0;
    }

    @Override
    public int deleteById(List<Long> ids) {
        return 0;
    }
}
