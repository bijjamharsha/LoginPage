package org.ass.guvi.dto;

public class ProfileDto {
	private int age;
	private String gender;
	private String dob;
	private String mobile;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "ProfileDto [age=" + age + ", gender=" + gender + ", dob=" + dob + ", mobile=" + mobile + "]";
	}
	
}
