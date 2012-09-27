/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.account;

import java.util.Date;

/**
 *
 * @author cyb
 */
public class Account {

    private String AccountID;
    private Date CreateAccountTime;
    private String BankName;
    private String CostumerAccountID;

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

    /**
     * @return the CreateAccountTime
     */
    public Date getCreateAccountTime() {
        return CreateAccountTime;
    }

    /**
     * @param CreateAccountTime the CreateAccountTime to set
     */
    public void setCreateAccountTime(Date CreateAccountTime) {
        this.CreateAccountTime = CreateAccountTime;
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
     * @return the CostumerAccountID
     */
    public String getCostumerAccount() {
        return CostumerAccountID;
    }

    /**
     * @param CostumerAccountID the CostumerAccountID to set
     */
    public void setCostumerAccount(String CostumerAccount) {
        this.CostumerAccountID = CostumerAccount;
    }
}
