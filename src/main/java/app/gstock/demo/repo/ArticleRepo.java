package app.gstock.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import app.gstock.demo.model.Article;

public interface ArticleRepo  extends JpaRepository<Article, Long> {

}
