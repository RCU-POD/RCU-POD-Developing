package hello.api.convert;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import hello.api.entity.CoffeeTypes;
import hello.api.model.MCoffeeTypes;

@Component("CoffeeTypesConverter")
public class CoffeeTypesConverter {

	public List<MCoffeeTypes> converterList(List<CoffeeTypes> coffeetypes){
		List<MCoffeeTypes> mctys = new ArrayList<>();
		
		for(CoffeeTypes coffeetype : coffeetypes) {
			mctys.add(new MCoffeeTypes(coffeetype));
		}
		
		return mctys;
	}

	
}
