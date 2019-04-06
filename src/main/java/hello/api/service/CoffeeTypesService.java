package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.CoffeeTypesConverter;
import hello.api.entity.CoffeeTypes;
import hello.api.model.MCoffeeTypes;
import hello.api.repository.CoffeeTypesRepository;


@Service("CoffeeTypesService")
public class CoffeeTypesService {
	
	@Autowired
	@Qualifier("CoffeeTypesRepository")
	private CoffeeTypesRepository repository;
	
	@Autowired
	@Qualifier("CoffeeTypesConverter")
	private CoffeeTypesConverter converter;
	
	public boolean create(CoffeeTypes coffeetypes) {
		try {
			
			
			repository.save(coffeetypes);
						
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(CoffeeTypes coffeetypes) {
		try {
			
			repository.save(coffeetypes);			
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public boolean delete(long id) {
		try {
			CoffeeTypes coffeetypes = repository.findById(id);
			repository.delete(coffeetypes);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MCoffeeTypes> getAll(){		
		return converter.converterList(repository.findAll());
	}
	
	

}
