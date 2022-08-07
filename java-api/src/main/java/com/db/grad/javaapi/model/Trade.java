package com.db.grad.javaapi.model;
import java.sql.Date;

import javax.persistence.*;


@Entity
@Table(name="Trade")
public class Trade {

	@Id
	private  int Id;
	private int Bookid;
	private int Counterpartyid ;
	private int Securityid;
	private int Quantity;
	private	boolean Status;
	private float Price;
	private String  Buy_sell;
	private Date Tradedate;
	private Date Settlementdate ;
	
	public Trade() {
		// TODO Auto-generated constructor stub
	}
	
	public Trade(int id, int Bookid, int Counterpartyid, int Securityid, int quantity, boolean status, float price,
			String Buy_sell, Date Tradedate, Date Settlementdate) {
		super();
		Id = id;
		this.Bookid = Bookid;
		this.Counterpartyid = Counterpartyid;
		this.Securityid = Securityid;
		Quantity = quantity;
		Status = status;
		Price = price;
		this.Buy_sell = Buy_sell;
		this.Tradedate = Tradedate;
		this.Settlementdate = Settlementdate;
	}
	@Id
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getId() {
		return this.Id;
	}
	
	@Column(name="Bookid")
	public void setBookid(int Bookid) {
		this.Bookid=Bookid;
	}
	public int getBookid () {
		return this.Bookid;
	}
	
	@Column (name="Counterpartyid")
	public void setCounterpartyid( int  Counterpartyid ) {
		this.Counterpartyid=Counterpartyid;
	}
	
	public int getCounterpartyid() {
		return this.Counterpartyid;
	}

	@Column (name="Securityid")
	public int getSecurityid() {
		return Securityid;
	}

	public void setSecurityid(int Securityid) {
		Securityid = Securityid;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getBuy_sell() {
		return Buy_sell;
	}

	public void setBuy_sell(String Buy_sell) {
		this.Buy_sell = Buy_sell;
	}

	public Date getTradedate() {
		return Tradedate;
	}

	public void setTradedate(Date Tradedate) {
		this.Tradedate = Tradedate;
	}

	public Date getSettlementdate() {
		return Settlementdate;
	}

	public void setSettlementdate(Date Settlementdate) {
		this.Settlementdate = Settlementdate;
	}
	
	
}
