package app.gstock.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import app.gstock.demo.model.Categorie;

public interface MagasinRepo extends JpaRepository<Categorie, Long> {

}
