package com.bridgelab;

public class Contacts {
	private String f_name;
	private String l_name;
	private String city;
	private String state;
	private String zip;
	private String m_number;
	private String mail;
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getM_number() {
		return m_number;
	}
	public void setM_number(String m_number) {
		this.m_number = m_number;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Contacts(String f_name, String l_name, String city, String state, String zip, String m_number, String mail) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.m_number = m_number;
		this.mail = mail;
	}
	  public String toString() {
	        return "\nFirst name: "+f_name+"\nLast name: "+l_name
	                +"\nCity: "+city
	                +"\nState: "+state+"\nZip: "+zip
	                +"\nPhone number: "+m_number+"\nEmail address: "+mail;
	    }
	
	

	
}
