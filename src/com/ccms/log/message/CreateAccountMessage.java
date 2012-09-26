/**
 * 
 */
package com.ccms.log.message;

import java.util.Date;

import com.ccms.account.AccountInfo;

/**
 * @author magic282
 * 
 */
public class CreateAccountMessage extends OriginMessage {
	public long BankID;
	public Date date = new Date();
	public AccountInfo info;
}
