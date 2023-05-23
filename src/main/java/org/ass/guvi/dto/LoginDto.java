package org.ass.guvi.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {
	private String email;
	private String Login;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	@Override
	public String toString() {
		return "LoginDto [email=" + email + ", Login=" + Login + "]";
	}
	
	
	
	

}
