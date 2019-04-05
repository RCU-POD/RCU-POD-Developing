package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.ContactUsConverter;
import hello.api.entity.ContactUs;
import hello.api.model.MContactUs;
import hello.api.repository.ContactUsRepository;


@Service("ContactUsService")
public class ContactUsService {
	
	@Autowired
	@Qualifier("ContactUsRepository")
	private ContactUsRepository repository;
	
	@Autowired
	@Qualifier("ContactUsConverter")
	private ContactUsConverter converter;
	
	public boolean create(ContactUs contactus) {
		try {
			
			repository.save(contactus);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(ContactUs contactus) {
		try {
			
			repository.save(contactus);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean delete(long id) {
		try {
			ContactUs contactus = repository.findById(id);
			repository.delete(contactus);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MContactUs> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	public MContactUs findById(long id) {
		return new MContactUs(repository.findById(id));
	}

}
