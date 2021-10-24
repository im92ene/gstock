package app.gstock.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.gstock.demo.model.Agent;
import app.gstock.demo.repo.AgentRepo;

@Service
@Transactional
public class AgentServiceImp implements AgentService{
	@Autowired	
	AgentRepo agentrepo;
	
	

	@Override
	public List<Agent> getAllAgents() {
		// TODO Auto-generated method stub
		return (List<Agent>) agentrepo.findAll();
	}

	@Override
	public Agent getAgentById(long id) {
		// TODO Auto-generated method stub
		return agentrepo.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Agent agent) {
		// TODO Auto-generated method stub
		agentrepo.save(agent);
		
	}

	@Override
	public void deleteAgent(long id) {
		// TODO Auto-generated method stub
		agentrepo.deleteById(id);
		
	}
}
