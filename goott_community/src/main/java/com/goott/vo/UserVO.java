package com.goott.vo;



public class UserVO {
	private int id;
	private String nickname;
	private String password;
	private String email;
	public UserVO(int id, String nickname, String password, String email) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", nickname=" + nickname + ", password=" + password + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
