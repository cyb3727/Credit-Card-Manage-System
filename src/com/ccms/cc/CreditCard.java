/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.cc;

import java.util.Date;

/**
 *
 * @author hit-acm
 */
public class CreditCard {

    private String CreditCardID;
    private String BankName;
    private Date CreateCreditCardTime;
    private String Password;
    private Date Deadline;
    private String Actived;
    private String Status;
    private String AccountID;

    /**
     * @return the CreditCardID
     */
    public String getCreditCardID() {
        return CreditCardID;
    }

    /**
     * @param CreditCardID the CreditCardID to set
     */
    public void setCreditCardID(String CreditCardID) {
        this.CreditCardID = CreditCardID;
    }

    /**
     * @return the BankName
     */
    public String getBankName() {
        return BankName;
    }

    /**
     * @param BankName the BankName to set
     */
    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    /**
     * @return the CreateCreditCardTime
     */
    public Date getCreateCreditCardTime() {
        return CreateCreditCardTime;
    }

    /**
     * @param CreateCreditCardTime the CreateCreditCardTime to set
     */
    public void setCreateCreditCardTime(Date CreateCreditCardTime) {
        this.CreateCreditCardTime = CreateCreditCardTime;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Deadline
     */
    public Date getDeadline() {
        return Deadline;
    }

    /**
     * @param Deadline the Deadline to set
     */
    public void setDeadline(Date Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * @return the Actived
     */
    public String getActived() {
        return Actived;
    }

    /**
     * @param Actived the Actived to set
     */
    public void setActived(String Actived) {
        this.Actived = Actived;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the AccountID
     */
    public String getAccountID() {
        return AccountID;
    }

    /**
     * @param AccountID the AccountID to set
     */
    public void setAccountID(String AccountID) {
        this.AccountID = AccountID;
    }
}
