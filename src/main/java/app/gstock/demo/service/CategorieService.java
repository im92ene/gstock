package app.gstock.demo.service;

import java.util.List;

import app.gstock.demo.model.Categorie;

public interface CategorieService {
 public List<Categorie> getAllCategories();
	 
	 public Categorie getCategorieById(long id);
	  
	 public void saveOrUpdate(Categorie categorie);
	 
	 public void deleteCategorie(long id);
}
