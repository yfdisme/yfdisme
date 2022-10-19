package com.yfd.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yfd.domain.vo.ArticleVO;

public interface IArticleService {
    Page<ArticleVO> articleVOPage();
}
