package hello.api.convert;

import org.springframework.stereotype.Component;

import hello.api.entity.Coffee_places;
import hello.api.model.MCoffee_places;

import java.util.List;
import java.util.ArrayList;


@Component("converter")
public class Converter {
	
	public List<MCoffee_places> converterList(List<Coffee_places> coffe_places){
		List<MCoffee_places> mcfs = new ArrayList<>();
		
		for(Coffee_places coffe_place : coffe_places ) {
			mcfs.add(new MCoffee_places(coffe_place));
		}
		
		return mcfs;
	}

}
