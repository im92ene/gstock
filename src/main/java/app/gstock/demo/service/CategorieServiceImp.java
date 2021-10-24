package app.gstock.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import app.gstock.demo.model.Categorie;
import app.gstock.demo.repo.CategorieRepo;

public class CategorieServiceImp implements CategorieService {
	@Autowired	
	CategorieRepo categorierepo;
	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return (List<Categorie>) categorierepo.findAll();
	}

	@Override
	public Categorie getCategorieById(long id) {
		// TODO Auto-generated method stub
		return categorierepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Categorie categorie) {
		// TODO Auto-generated method stub
		categorierepo.save(categorie);
		
	}

	@Override
	public void deleteCategorie(long id) {
		// TODO Auto-generated method stub
		categorierepo.deleteById(id);
		
	}
}
