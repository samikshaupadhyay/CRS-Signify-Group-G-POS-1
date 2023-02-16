/**
 * 
 */
package com.signify.bean;

/**
 * @author dp201
 *
 */
public class NetBanking extends Online{

	private String IFSCode, modeOfTransfer;
	private int accountNumber;
	public String getIFSCode() {
		return IFSCode;
	}
	public void setIFSCode(String iFSCode) {
		IFSCode = iFSCode;
	}
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
