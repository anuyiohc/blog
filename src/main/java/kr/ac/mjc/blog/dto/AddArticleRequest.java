package kr.ac.mjc.blog.dto;

import kr.ac.mjc.blog.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){
        Article article= new Article(title,content);
        return article;

    }
}
