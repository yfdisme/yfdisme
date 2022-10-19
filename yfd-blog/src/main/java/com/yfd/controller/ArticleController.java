package com.yfd.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yfd.domain.vo.ArticleVO;
import com.yfd.service.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private IArticleService articleService;
    @GetMapping("/page")
    public Page<ArticleVO> page(){
        return articleService.articleVOPage();
    }
}
