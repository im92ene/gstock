package app.gstock.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.gstock.demo.model.Agent;
@Repository
public interface AgentRepo extends JpaRepository<Agent, Long>{

}
