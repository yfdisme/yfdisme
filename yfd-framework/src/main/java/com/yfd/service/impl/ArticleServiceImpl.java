package com.yfd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yfd.domain.vo.ArticleVO;
import com.yfd.domain.entity.Article;
import com.yfd.mapper.ArticleMapper;
import com.yfd.service.IArticleService;
import org.springframework.stereotype.Service;
import com.yfd.Utils.YfdBeanUtils;

import java.util.List;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {
    @Override
    public Page<ArticleVO> articleVOPage() {
        LambdaQueryWrapper<Article> articleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<Article> articlePage = new Page<>(1, 10);
        Page<Article> selectPage = baseMapper.selectPage(articlePage, articleLambdaQueryWrapper);
        List<ArticleVO> articleVOS = YfdBeanUtils.copyBeanList(selectPage.getRecords(), ArticleVO.class);
        Page<ArticleVO> articleVOPage = new Page<>();
        return  articleVOPage.setRecords(articleVOS);
    }
}
