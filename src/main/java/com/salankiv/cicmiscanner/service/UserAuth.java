package com.salankiv.cicmiscanner.service;

import java.util.Base64;

public class UserAuth {
	private String username;
	private String password;

	public UserAuth(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public String concatUserPwd() {
		String concatString = this.getUsername() + ":" + this.getPassword();
		return concatString;
	}
	public String getAuth() {
		byte[] encodedBytes = Base64.getEncoder().encode(this.concatUserPwd().getBytes());
		return new String(encodedBytes);
	}
}