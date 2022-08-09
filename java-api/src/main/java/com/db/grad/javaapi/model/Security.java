package com.db.grad.javaapi.model;
import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Security")

public class Security {
	@Id
	private int Id;
	private String Isin;
	private String Cusip;
	private String Issuer;
	private Date Maturitydate;
	private float Coupon ;
	private String Type;
	private float Facevalue;
	private boolean Status;
	
	public Security() {
		// TODO Auto-generated constructor stub
	}

	public Security(int id, String isin, String cusip, String issuer, Date Maturitydate, float coupon, String type,
			float Facevalue, boolean status) {
		super();
		Id = id;
		Isin = isin;
		Cusip = cusip;
		Issuer = issuer;
		this.Maturitydate = Maturitydate;
		Coupon = coupon;
		Type = type;
		this.Facevalue = Facevalue;
		Status = status;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getIsin() {
		return Isin;
	}

	public void setIsin(String isin) {
		Isin = isin;
	}

	public String getCusip() {
		return Cusip;
	}

	public void setCusip(String cusip) {
		Cusip = cusip;
	}

	public String getIssuer() {
		return Issuer;
	}

	public void setIssuer(String issuer) {
		Issuer = issuer;
	}

	public Date getMaturitydate() {
		return Maturitydate;
	}

	public void setMaturitydate(Date Maturitydate) {
		this.Maturitydate = Maturitydate;
	}

	public float getCoupon() {
		return Coupon;
	}

	public void setCoupon(float coupon) {
		Coupon = coupon;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public float getFacevalue() {
		return Facevalue;
	}

	public void setFacevalue(float Facevalue) {
		this.Facevalue = Facevalue;
	}

	public boolean getStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	

}
