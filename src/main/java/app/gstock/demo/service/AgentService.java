package app.gstock.demo.service;

import java.util.List;
import app.gstock.demo.model.Agent;
public interface AgentService {
	 public List<Agent> getAllAgents();
	 
	 public Agent getAgentById(long id);
	  
	 public void saveOrUpdate(Agent agent);
	 
	 public void deleteAgent(long id);

}