package hello.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hello.api.entity.Citys;
import hello.api.service.CitysService;




@RestController
@RequestMapping("/api")
public class CitysController {
	
	@Autowired
	@Qualifier("CitysService")
	CitysService service;
	
	@GetMapping("/citys")
	public List getCitys() {
		return service.getAll();
	}
	
	@PostMapping("/citys")
	public boolean addCitys(@RequestBody @Valid Citys citys) {
		return service.create(citys);
	}
	
	@PutMapping("/citys")
	public boolean updateCitys(@RequestBody @Valid Citys citys) {
		return service.update(citys);
	}
	
	
		
	@DeleteMapping("/citys/{id}")
	public boolean deleteCitys(@PathVariable("id") long id) {
		return service.delete(id);
	}

}
