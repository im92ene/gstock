package app.gstock.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*import org.springframework.security.access.prepost.PreAuthorize;*/
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

import app.gstock.demo.model.Agent;
import app.gstock.demo.repo.AgentRepo;
import app.gstock.demo.exception.*;





@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AgentController {

	@Autowired
	private AgentRepo agentRepo;

	@GetMapping("/agents")
	/*@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")*/
	public List<Agent> getAll() {
		return agentRepo.findAll();
	}

	@GetMapping("/agent/{id}")
	/*@PreAuthorize("hasRole('ADMIN') or hasRole('USER')")*/
	public ResponseEntity<Agent> getAgentById(@PathVariable(value = "id") Long agentId)
			throws ResourceNotFoundException {
		Agent agent = agentRepo.findById(agentId)
				.orElseThrow(() -> new ResourceNotFoundException("Agent not found for this id :: " + agentId));
		return ResponseEntity.ok().body(agent);
	}

	@PostMapping("/agents")
	/*@PreAuthorize("hasRole('ADMIN')")*/
	public Agent createAgent( @RequestBody Agent agent) {
		return agentRepo.save(agent);
	}

	@PutMapping("/agents/{id}")
	/*@PreAuthorize("hasRole('ADMIN')")*/
	public ResponseEntity<Agent> updateAgent(@PathVariable(value = "id") Long agentId,
			/*@Valid*/ @RequestBody Agent agentDetails) throws ResourceNotFoundException {
		Agent agent = agentRepo.findById(agentId)
				.orElseThrow(() -> new ResourceNotFoundException("agent not found for this id :: " + agentId));

		agent.setId(agentDetails.getId());
		agent.setNom(agentDetails.getNom());
		agent.setCode(agentDetails.getCode());
		agent.setLibGrade(agentDetails.getLibGrade());
		agent.setMat(agentDetails.getMat());
		final Agent updatedagent = agentRepo.save(agent);
		return ResponseEntity.ok(updatedagent);
	}

	@DeleteMapping("/agents/{id}")
	/*@PreAuthorize("hasRole('ADMIN')")*/
	public Map<String, Boolean> deleteAgent(@PathVariable(value = "id") Long agentId)
			throws ResourceNotFoundException {
		Agent agent = agentRepo.findById(agentId)
				.orElseThrow(() -> new ResourceNotFoundException("agent not found for this id :: " + agentId));

		agentRepo.delete(agent);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	
	
	
	
	

}
