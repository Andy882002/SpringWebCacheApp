package com.app.domain;

public class Insurancecp {

	private Integer sid;
	private String name;
	private String grup;
	private String mid;
	private String exp;
	@Override
	public String toString() {
		return "Insurancecp [sid=" + sid + ", name=" + name + ", grup=" + grup
				+ ", mid=" + mid + ", exp=" + exp + "]";
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrup() {
		return grup;
	}
	public void setGrup(String grup) {
		this.grup = grup;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public Insurancecp(Integer sid, String name, String grup, String mid,
			String exp) {
		super();
		this.sid = sid;
		this.name = name;
		this.grup = grup;
		this.mid = mid;
		this.exp = exp;
	}
	public Insurancecp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
