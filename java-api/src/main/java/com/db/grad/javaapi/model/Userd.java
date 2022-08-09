package com.db.grad.javaapi.model;
import javax.persistence.*;


@Entity
@Table (name="Userd")
public class Userd {

	private int Id;
	private String Name;
	@Id
	private String Email;
	private String Role;
	private String Password;
	
	public Userd() {
		// TODO Auto-generated constructor stub
	}
	public Userd(int Id, String Name, String Email, String Role,String Password) {
		this.Id=Id;
		this.Name=Name;
		this.Email=Email;
		this.Role=Role;
		this.Password=Password;
	}
	public Userd(String name, String email) {
		
		this.Name=name;
		this.Email=email;
	}

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
	@Column(name="Password")
	public void setPassword(String Password) {
		this.Password=Password;
	}
	public String getPassword() {
		return this.Password;
	}
	
}
