package hello.api.model;

import hello.api.entity.States;

public class MStates {

	
	public MStates(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public MStates(States states) {
		this.id = states.getId();
		this.name = states.getName();
	}
	
	public MStates() {
		
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
