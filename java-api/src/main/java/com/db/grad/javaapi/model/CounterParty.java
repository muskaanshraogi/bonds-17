package com.db.grad.javaapi.model;
import javax.persistence.*;

@Entity
@Table (name="CounterParty")
public class CounterParty {
	@Id
	private int Id;
	private String Name;
	public CounterParty() {
		// TODO Auto-generated constructor stub
	}
	public CounterParty (int Id, String Name) {
		this.Id=Id;
		this.Name=Name;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	

}
