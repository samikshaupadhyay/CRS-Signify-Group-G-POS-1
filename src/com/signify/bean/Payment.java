package com.signify.bean;
public class Payment {
	
//	attributes here!
	private int studentId;
	private String referencedId;
	private float amount;
	private boolean status;
	
//	setters and getters here!
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getReferencedId() {
		return referencedId;
	}
	public void setReferencedId(String referencedId) {
		this.referencedId = referencedId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
