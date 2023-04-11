package com.tushar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loginuser")
public class Loginuser {
	
private int userid;
private String firstname;
private String lastname;
private String email;
private String password;

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Column(name = "userid")
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
@Override
public String toString() {
	return "Loginuser [userid=" + userid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", password=" + password + "]";
}


}
