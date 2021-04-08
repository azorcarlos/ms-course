package com.devsuperior.hrworker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repository.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	private WorkerRepository repository;

	
	@Autowired
	public WorkerResource(WorkerRepository repository) {
		this.repository = repository;
	}

	@GetMapping
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = repository.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		Optional<Worker> obj = repository.findById(id);

		if(obj.isPresent()){
			return ResponseEntity.ok(obj.get());
		}
		return ResponseEntity.notFound().build();
	}

}
