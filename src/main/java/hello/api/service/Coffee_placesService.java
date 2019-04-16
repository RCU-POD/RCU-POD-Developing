package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.Converter;
import hello.api.entity.Coffee_places;
import hello.api.model.MCoffee_places;
import hello.api.repository.Coffee_placesRepository;

@Service("service")
public class Coffee_placesService {
	
	@Autowired
	@Qualifier("repository")
	private Coffee_placesRepository repository;
	
	
	@Autowired
	@Qualifier("converter")
	private Converter converter;
	
	public boolean create(Coffee_places coffe_places) {
		try {
			
			repository.save(coffe_places);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(Coffee_places coffe_places) {
		try {
			repository.save(coffe_places);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	public boolean delete(long id) {
		try {
			
			Coffee_places coffe_places = repository.findById(id);
			repository.delete(coffe_places);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MCoffee_places> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	public MCoffee_places getByName(String name) {
		return new MCoffee_places(repository.findByName(name));
	}
	

}
