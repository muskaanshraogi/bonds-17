package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")

public class Book {
	@Id
	private int Id;
	private String Bookname;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public  Book(int id, String name) {
		this.Id=id;
		this.Bookname=name;
	}
	@Id
	public int getId() {
		return this.Id;
	}
	
	public void setId(int id) {
		this.Id=id;
	}
	@Column (name="Bookname", nullable=false)
	public String getBookname() {
		return this.Bookname;
	}
	public void setBookname(String name) {
		this.Bookname=name;
	}
	

}
