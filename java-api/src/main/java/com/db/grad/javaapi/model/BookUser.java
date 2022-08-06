package com.db.grad.javaapi.model;
import javax.persistence.*;

@Entity
@Table (name="BookUser")
public class BookUser {
	@Id
	private int BookId;
	private int UserId;
	
	public BookUser() {
		// TODO Auto-generated constructor stub
	}
	
	public BookUser(int BookId,int UserId) {
		this.BookId=BookId;
		this.UserId=UserId;
	}
	
	@Id
	@Column (name="BookId")
	public void setBookId(int BookId) {
		this.BookId=BookId;		
	}
	public int getBookId() {
		return this.BookId;
	}

	@Column (name="UserId")
	public void setUserId(int UserId) {
		this.UserId=UserId;		
	}
	public int getUserId() {
		return this.UserId;
	}
}
