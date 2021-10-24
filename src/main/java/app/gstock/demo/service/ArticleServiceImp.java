package app.gstock.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import app.gstock.demo.model.Article;

import app.gstock.demo.repo.ArticleRepo;


@Service
@Transactional
public class ArticleServiceImp implements ArticleService{

ArticleRepo  articlerepo;
	

	@Override
	public List<Article> getAllArticles() {
		// TODO Auto-generated method stub
		return (List<Article>) articlerepo.findAll();
	}

	@Override
	public Article getArticleById(long id) {
		// TODO Auto-generated method stub
		return articlerepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Article article) {
		// TODO Auto-generated method stub
		articlerepo.save(article);
		
	}

	@Override
	public void deleteArticle(long id) {
		// TODO Auto-generated method stub
		articlerepo.deleteById(id);
		
	}
}
