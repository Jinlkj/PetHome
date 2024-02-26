package edu.cqu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import edu.cqu.article.dto.ArticleDto;
import edu.cqu.article.pojos.Article;
import edu.cqu.common.Response;

public interface ArticleListService extends IService<Article>{
    Response load(Short loadtype, ArticleDto dto);
}
