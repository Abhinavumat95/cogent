package com.cogent.Batch65_SpringBoottwo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBoottwo.Entity.Performer;
import com.cogent.Batch65_SpringBoottwo.Repo.PerformerRepository;

@RestController
public class PerformerController {
	
	@Autowired
	PerformerRepository performerRepository;
	
	@PostMapping("addperformer")
	public Performer addPerformer(@RequestBody Performer newPerformer) {
		System.out.println("Adding record to database");
		return performerRepository.save(newPerformer);

	}
	
	@GetMapping("getperformer")
	public List<Performer> getPerformer() {

		return performerRepository.findAll();

	}
	
	@DeleteMapping("deleteperformer/{id}")
	public void deletePerformer(@PathVariable("id") int id) {
		performerRepository.deleteById(id);
	}

}
