package com.db.grad.javaapi.model;
import javax.persistence.*;


@Entity
@Table (name="User")
public class UserD {

	@Id
	private int Id;
	private String Name;
	private String Email;
	private String Role;
	
	public UserD() {
		// TODO Auto-generated constructor stub
	}
	public UserD(int Id, String Name, String Email, String Role) {
		this.Id=Id;
		this.Name=Name;
		this.Email=Email;
		this.Role=Role;
	}
	
	@Id
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getId() {
		return this.Id;
	}
	@Column (name="Name")
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return this.Name;
	}
	
	@Column (name="Email")
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public String getEmail() {
		return this.Email;
	}
	
	@Column(name="Role")
	public void setRole(String Role) {
		this.Role=Role;
	}
	public String getRole() {
		return this.Role;
	}
	
}
