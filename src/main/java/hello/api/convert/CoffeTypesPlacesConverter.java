package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.CoffeTypesPlaces;
import hello.api.model.MCoffeTypesPlaces;


@Component("CoffeTypesPlacesConverter")
public class CoffeTypesPlacesConverter {
	
	public List<MCoffeTypesPlaces> converterList(List<CoffeTypesPlaces> coffetypesplaces){
		List<MCoffeTypesPlaces> mctp = new ArrayList<>();
		
		for(CoffeTypesPlaces coffetypePlace : coffetypesplaces) {
			mctp.add(new MCoffeTypesPlaces(coffetypePlace));
		}
		
		return mctp;
	}

}
