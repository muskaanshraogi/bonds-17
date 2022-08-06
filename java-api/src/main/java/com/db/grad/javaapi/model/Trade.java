package com.db.grad.javaapi.model;
import java.sql.Date;

import javax.persistence.*;

public class Trade {

	@Id
	private  int Id;
	private int BookId;
	private int CounterPartyId ;
	private int SecurityId;
	private int Quantity;
	private	boolean Status;
	private float Price;
	private String  Buy_Sell;
	private Date TradeDate;
	private Date SettlementDate ;
	
	public Trade() {
		// TODO Auto-generated constructor stub
	}
	
	public Trade(int id, int bookId, int counterPartyId, int securityId, int quantity, boolean status, float price,
			String buy_Sell, Date tradeDate, Date settlementDate) {
		super();
		Id = id;
		BookId = bookId;
		CounterPartyId = counterPartyId;
		SecurityId = securityId;
		Quantity = quantity;
		Status = status;
		Price = price;
		Buy_Sell = buy_Sell;
		TradeDate = tradeDate;
		SettlementDate = settlementDate;
	}
	@Id
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getId() {
		return this.Id;
	}
	
	@Column(name="BookId")
	public void setBookId(int BookId) {
		this.BookId=BookId;
	}
	public int getBookId () {
		return this.BookId;
	}
	
	@Column (name="CounterPartyId")
	public void setCounterPartyId( int  CounterPartyId ) {
		this.CounterPartyId=CounterPartyId;
	}
	
	public int getCounterPartyId() {
		return this.CounterPartyId;
	}

	@Column (name="SecurityId")
	public int getSecurityId() {
		return SecurityId;
	}

	public void setSecurityId(int securityId) {
		SecurityId = securityId;
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

	public String getBuy_Sell() {
		return Buy_Sell;
	}

	public void setBuy_Sell(String buy_Sell) {
		Buy_Sell = buy_Sell;
	}

	public Date getTradeDate() {
		return TradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		TradeDate = tradeDate;
	}

	public Date getSettlementDate() {
		return SettlementDate;
	}

	public void setSettlementDate(Date settlementDate) {
		SettlementDate = settlementDate;
	}
	
	
}
