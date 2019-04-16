package hello.api.model;

import hello.api.entity.CoffeTypesPlaces;

public class MCoffeTypesPlaces {

	public MCoffeTypesPlaces(long types, long coffee) {
		this.types = types;
		this.coffee = coffee;
	}
	
	public MCoffeTypesPlaces(CoffeTypesPlaces coffeetypesplace) {
		this.types = coffeetypesplace.getTypes();
		this.coffee = coffeetypesplace.getCoffee();
	}
	
	public MCoffeTypesPlaces() {
		
	}
	
	
	private long types;
	private long coffee;
	public long getTypes() {
		return types;
	}
	public void setTypes(long types) {
		this.types = types;
	}
	public long getCoffee() {
		return coffee;
	}
	public void setCoffee(long coffee) {
		this.coffee = coffee;
	}
	
	
}
