package hello.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import hello.api.convert.CoffeTypesPlacesConverter;
import hello.api.entity.CoffeTypesPlaces;
import hello.api.model.MCoffeTypesPlaces;
import hello.api.repository.CoffeTypesPlacesRepository;

@Service("CoffeTypesPlacesService")
public class CoffeTypesPlacesService {
	
	@Autowired
	@Qualifier("CoffeTypesPlacesRepository")
	private CoffeTypesPlacesRepository repository;
	
	
	@Autowired
	@Qualifier("CoffeTypesPlacesConverter")
	private CoffeTypesPlacesConverter converter;
	
	public boolean create(CoffeTypesPlaces coffetypesplaces) {
		try {
			
			repository.save(coffetypesplaces);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean update(CoffeTypesPlaces coffetypesplaces) {
		try {
			repository.save(coffetypesplaces);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	
	public boolean delete(long id) {
		try {
			
			CoffeTypesPlaces coffetypesplaces = repository.findByCoffee(id);
			repository.delete(coffetypesplaces);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public boolean deleteByCoffeeAndTypes(long coffee, long types) {
		try {
			
			CoffeTypesPlaces coffetypesplaces = repository.findByCoffeeAndTypes(coffee, types);
			repository.delete(coffetypesplaces);
			
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<MCoffeTypesPlaces> getAll(){		
		return converter.converterList(repository.findAll());
	}
	

}
