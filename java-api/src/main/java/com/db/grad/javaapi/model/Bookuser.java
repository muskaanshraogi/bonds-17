package com.db.grad.javaapi.model;
import javax.persistence.*;

@Entity
@Table (name="Bookuser")
public class Bookuser {
	@Id
	private int Bookid;
	private int Userid;
	
	public Bookuser() {
		// TODO Auto-generated constructor stub
	}
	
	public Bookuser(int Bookid,int UserId) {
		this.Bookid=Bookid;
		this.Userid=UserId;
	}
	
	@Id
	@Column (name="Bookid")
	public void setBookid(int Bookid) {
		this.Bookid=Bookid;		
	}
	public int getBookid() {
		return this.Bookid;
	}

	@Column (name="Userid")
	public void setUserId(int UserId) {
		this.Userid=UserId;		
	}
	public int getUserId() {
		return this.Userid;
	}
}
