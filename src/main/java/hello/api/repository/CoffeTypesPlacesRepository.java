package hello.api.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.api.entity.CoffeTypesPlaces;


@Repository("CoffeTypesPlacesRepository")
public interface CoffeTypesPlacesRepository extends JpaRepository<CoffeTypesPlaces,Serializable> {
	
	public abstract CoffeTypesPlaces findByCoffee(long id);
	public abstract CoffeTypesPlaces findByTypes(long id);
	
	public abstract CoffeTypesPlaces findByCoffeeAndTypes(long coffee,long types);

}
