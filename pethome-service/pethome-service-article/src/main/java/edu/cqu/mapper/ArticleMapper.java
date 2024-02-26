package edu.cqu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.cqu.article.dto.ArticleDto;
import edu.cqu.article.pojos.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    public List<Article> loadArticleList(@Param("dto") ArticleDto dto, @Param("type") Short type);

    public List<Article> findArticleListByLast5days(@Param("dayParam") Date dayParam);

//    public Map queryLikesAndConllections(@Param("wmUserId") Integer wmUserId, @Param("beginDate") Date beginDate, @Param("endDate")  Date endDate);
//
//    List<ArticleCommnetVo> findNewsComments(@Param("dto")  ArticleCommentDto dto);
//
//    int findNewsCommentsCount(@Param("dto")  ArticleCommentDto dto);
}
