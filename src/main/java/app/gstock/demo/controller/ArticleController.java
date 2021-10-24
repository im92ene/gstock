package app.gstock.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import app.gstock.demo.exception.ResourceNotFoundException;

import app.gstock.demo.model.Article;
import app.gstock.demo.repo.ArticleRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ArticleController {
	@Autowired
	private ArticleRepo articleRepo;
	@GetMapping("/articles")
	public List<Article> getAll() {
		return articleRepo.findAll();
	}

	@GetMapping("/article/{id}")
	
	public ResponseEntity<Article> getArticleById(@PathVariable(value = "id") Long articleId)
			throws ResourceNotFoundException {
		Article article = articleRepo.findById(articleId)
				.orElseThrow(() -> new ResourceNotFoundException("Article not found for this id :: " + articleId));
		return ResponseEntity.ok().body(article);
	}

	@PostMapping("/articles")
	
	public Article createArticle( @RequestBody Article article) {
		return articleRepo.save(article);
	}

	@PutMapping("/article/{id}")
	
	public ResponseEntity<Article> updateArticle(@PathVariable(value = "id") Long articleId,@RequestBody Article articleDetails) throws ResourceNotFoundException {
		Article article = articleRepo.findById(articleId)
				.orElseThrow(() -> new ResourceNotFoundException("article not found for this id :: " + articleId));

		article.setId(articleDetails.getId());
		article.setNom(articleDetails.getNom());
		article.setQuant_in_stock(articleDetails.getQuant_in_stock());
		article.setReference(articleDetails.getReference());
		article.setCategorie(articleDetails.getCategorie());
		final Article updatedarticle = articleRepo.save(article);
		return ResponseEntity.ok(updatedarticle);
	}

	@DeleteMapping("/article/{id}")
	public Map<String, Boolean> deleteArticle(@PathVariable(value = "id") Long articleId)
			throws ResourceNotFoundException {
		Article article = articleRepo.findById(articleId)
				.orElseThrow(() -> new ResourceNotFoundException("agent not found for this id :: " + articleId));

		articleRepo.delete(article);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
}
