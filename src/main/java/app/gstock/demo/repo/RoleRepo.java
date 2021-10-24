package app.gstock.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import app.gstock.demo.model.Role;

public interface RoleRepo  extends JpaRepository<Role, Long>{

}
