package hello.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="coffee_types_has_coffee_places")
@Entity
public class CoffeTypesPlaces implements Serializable {
	
	public CoffeTypesPlaces(long types, long coffee) {
		
		this.types = types;
		this.coffee = coffee;
	}
	
	public CoffeTypesPlaces() {
		
	}

	@Id
	@Column(name="types")
	private long types;
	
	@Column(name="coffee")
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
