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

import hello.api.entity.ContactUs;
import hello.api.model.MContactUs;
import hello.api.service.ContactUsService;



@RestController
@RequestMapping("/api")
public class ContactUsController {

	
	@Autowired
	@Qualifier("ContactUsService")
	ContactUsService service;
	
	@GetMapping("/contactus")
	public List getContactUs() {
		return service.getAll();
	}
	
	@PostMapping("/contactus")
	public boolean addContactUs(@RequestBody @Valid ContactUs contactus) {
		return service.create(contactus);
	}
	
	@PutMapping("/contactus")
	public boolean updateContactUs(@RequestBody @Valid ContactUs contactus) {
		return service.update(contactus);
	}
	
	
	@GetMapping("/contactus/{id}")
	public MContactUs getByCoffe(@PathVariable("id") long id) {
		return service.findById(id);
	}
	
	@DeleteMapping("/contactus/{id}")
	public boolean deleteContactUs(@PathVariable("id") long id) {
		return service.delete(id);
	}
	
}
