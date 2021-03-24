package com.faith.app.entity;

public class User {
	
	private int Uid;
	private String Username;
	private String password;
	
	//getters and setters
	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [Uid=" + Uid + ", Username=" + Username + ", password=" + password + "]";
	}
	
	
}
