package model;

public class User {
	private long mobile_no;
	public long getMobileno() {
		return mobile_no;
	}
	public void setMobileno(long mobileno) {
		this.mobile_no = mobileno;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
	private String password;

}
