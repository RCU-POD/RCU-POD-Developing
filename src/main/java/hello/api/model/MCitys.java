package hello.api.model;

import hello.api.entity.Citys;

public class MCitys {

	
	public MCitys(long id, String name, long states_id) {
		this.id = id;
		this.name = name;
		this.states_id = states_id;
	}

	public MCitys(Citys citys) {
		this.id = citys.getId();
		this.name = citys.getName();
		this.states_id = citys.getStates_id();
	}
	
	public MCitys() {
		
	}
	
	private long id;
	private String name;
	private long states_id;
	
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

	public long getStates_id() {
		return states_id;
	}

	public void setStates_id(long states_id) {
		this.states_id = states_id;
	}
	
}
