package hello.api.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="citys")
@Entity
public class Citys implements Serializable{
	
	public Citys(long id, String name, long states_id) {
		this.id = id;
		this.name = name;
		this.states_id = states_id;
	}

	public Citys() {
		
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="states_id")
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
