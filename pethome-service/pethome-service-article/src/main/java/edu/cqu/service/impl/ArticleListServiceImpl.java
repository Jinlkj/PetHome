package edu.cqu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.cqu.article.dto.ArticleDto;
import edu.cqu.article.pojos.Article;
import edu.cqu.common.Response;
import edu.cqu.mapper.ArticleMapper;
import edu.cqu.service.ArticleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleListServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleListService {
    @Autowired
    ArticleMapper articleMapper;
    @Override
    public Response load(Short loadtype, ArticleDto dto) {
        List<Article> articles = articleMapper.loadArticleList(dto, loadtype);
        return Response.okResult(200,"",articles);
    }
}