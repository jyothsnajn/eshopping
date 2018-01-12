package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Component
public class User {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@NotEmpty (message="enter user id")
	private String username;
	//@NotEmpty (message="enter password")
	private String userpassword;
	@NotEmpty (message="enter mail id")
	private String usermailid;
	//@NotEmpty (message="enter phone number")
	private int contactno;
	private String role;
	
	public User() {
		role="ROLE_USER";
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUsermailid() {
		return usermailid;
	}
	public void setUsermailid(String usermailid) {
		this.usermailid = usermailid;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}

