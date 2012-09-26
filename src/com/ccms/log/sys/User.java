/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.log.sys;

/**
 * 
 * @author hit-acm
 */
public class User {

	public static enum userType {
		Common, Admin
	};

	private String UserID;
	private String UserName;
	private userType type;
	private String EmailAddress;
	private String Status;
	private String BankID;

	/**
	 * @return the UserID
	 */
	public String getUserID() {
		return UserID;
	}

	/**
	 * @param UserID
	 *            the UserID to set
	 */
	public void setUserID(String UserID) {
		this.UserID = UserID;
	}

	/**
	 * @return the UserName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param UserName
	 *            the UserName to set
	 */
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}



	/**
	 * @return the EmailAddress
	 */
	public String getEmailAddress() {
		return EmailAddress;
	}

	/**
	 * @param EmailAddress
	 *            the EmailAddress to set
	 */
	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	/**
	 * @return the Status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param Status
	 *            the Status to set
	 */
	public void setStatus(String Status) {
		this.Status = Status;
	}

	/**
	 * @return the BankID
	 */
	public String getBankID() {
		return BankID;
	}

	/**
	 * @param BankID
	 *            the BankID to set
	 */
	public void setBankID(String BankID) {
		this.BankID = BankID;
	}
	


	/**
	 * @return the type
	 */
	public userType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(userType type) {
		this.type = type;
	}

}
