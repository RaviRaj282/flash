/**
 * 
 */
package com.nt.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

/**
 * @author raviraj
 *
 */
public class User {
	private String Firstname;
	private String lastname;
	private String email;
	private String password;
	private String gender;

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [Firstname=" + Firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password
				+ ", gender=" + gender + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
