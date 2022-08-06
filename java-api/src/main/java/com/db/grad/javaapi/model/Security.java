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
	private Date MaturityDate;
	private float Coupon ;
	private String Type;
	private float FaceValue;
	private boolean Status;
	
	public Security() {
		// TODO Auto-generated constructor stub
	}

	public Security(int id, String isin, String cusip, String issuer, Date maturityDate, float coupon, String type,
			float faceValue, boolean status) {
		super();
		Id = id;
		Isin = isin;
		Cusip = cusip;
		Issuer = issuer;
		MaturityDate = maturityDate;
		Coupon = coupon;
		Type = type;
		FaceValue = faceValue;
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

	public Date getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
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

	public float getFaceValue() {
		return FaceValue;
	}

	public void setFaceValue(float faceValue) {
		FaceValue = faceValue;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	

}
