package edu.cqu.controller;

import edu.cqu.article.dto.ArticleDto;
import edu.cqu.common.Response;
import edu.cqu.common.constants.ArticleConstants;
import edu.cqu.service.ArticleListService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article")
public class ArticleController {
    @Autowired
    private ArticleListService articleListService;
    @PostMapping("/getHome")
    public Response getHomePage(@RequestBody ArticleDto dto){
        Response response = articleListService.load(ArticleConstants.LOADTYPE_LOAD_MORE,dto);
        return response;
    }
}
