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

import app.gstock.demo.model.Categorie;

import app.gstock.demo.repo.CategorieRepo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CategorieController {
	@Autowired
	private CategorieRepo categorieRepo;
	@GetMapping("/categories")
	public List<Categorie> getAll() {
		return categorieRepo.findAll();
	}

	@GetMapping("/categorie/{id}")
	
	public ResponseEntity<Categorie> getCategorieById(@PathVariable(value = "id") Long categorieId)
			throws ResourceNotFoundException {
		Categorie categorie = categorieRepo.findById(categorieId)
				.orElseThrow(() -> new ResourceNotFoundException("categorie not found for this id :: " + categorieId));
		return ResponseEntity.ok().body(categorie);
	}

	@PostMapping("/categories")
	
	public Categorie createCategorie( @RequestBody Categorie categorie) {
		return categorieRepo.save(categorie);
	}

	@PutMapping("/categorie/{id}")
	
	public ResponseEntity<Categorie> updateCategorie(@PathVariable(value = "id") Long categorieId,@RequestBody Categorie categorieDetails) throws ResourceNotFoundException {
		Categorie categorie = categorieRepo.findById(categorieId)
				.orElseThrow(() -> new ResourceNotFoundException("categorie not found for this id :: " + categorieId));

		categorie.setId(categorieDetails.getId());
		categorie.setCategoriePere(categorieDetails.getCategoriePere());
		categorie.setCode_categorie(categorieDetails.getCode_categorie());
		categorie.setNom_categorie(categorieDetails.getNom_categorie());

		final Categorie updatedcategorie = categorieRepo.save(categorie);
		return ResponseEntity.ok(updatedcategorie);
	}

	@DeleteMapping("/categorie/{id}")
	public Map<String, Boolean> deleteCategorie(@PathVariable(value = "id") Long categorieId)
			throws ResourceNotFoundException {
		Categorie categorie = categorieRepo.findById(categorieId)
				.orElseThrow(() -> new ResourceNotFoundException("categorie not found for this id :: " + categorieId));

		categorieRepo.delete(categorie);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
}
