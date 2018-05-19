package com.spring.jdbc.simple_jdbc_template;

public class CustomerTO {
	private int cid;
	private String cname;
	private String email;
	private long phone;
	private String city;
	
	public CustomerTO() {}

	public CustomerTO(int cid, String cname,long phone,String email, String city) {
		super();
		this.cid = cid;
		this.cname=cname;
		this.phone=phone;
		this.email = email;
		this.city = city;
	}

	public int getCid() {
		return cid;
	}
	
	

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CustomerTO [cid=" + cid + ", cname=" + cname + ", email=" + email + ", phone=" + phone + ", city="
				+ city + "]";
	}

	

}
