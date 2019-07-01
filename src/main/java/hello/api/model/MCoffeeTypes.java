package hello.api.model;

import hello.api.entity.CoffeeTypes;

public class MCoffeeTypes {
	
	public MCoffeeTypes(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public MCoffeeTypes(CoffeeTypes coffetypes) {
		this.id = coffetypes.getId();
		this.name = coffetypes.getName();
	}
	
	public MCoffeeTypes() {
		
	}

	private long id;
	
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
