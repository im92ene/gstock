package app.gstock.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import app.gstock.demo.model.Demande;

public interface DemandeRepo  extends JpaRepository<Demande, Long>{

}
