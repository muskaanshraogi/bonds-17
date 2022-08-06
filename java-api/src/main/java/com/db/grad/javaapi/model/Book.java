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
	private String BookName;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public  Book(int id, String name) {
		this.Id=id;
		this.BookName=name;
	}
	@Id
	public int getId() {
		return this.Id;
	}
	
	public void setId(int id) {
		this.Id=id;
	}
	@Column (name="BookName", nullable=false)
	public String getBookName() {
		return this.BookName;
	}
	public void setBookName(String name) {
		this.BookName=name;
	}
	

}
