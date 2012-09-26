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
public class Loss {

    private String LossID;
    private Date LossCostumer;
    private String CreditCardID;
    private Date LossDate;

    /**
     * @return the LossID
     */
    public String getLossID() {
        return LossID;
    }

    /**
     * @param LossID the LossID to set
     */
    public void setLossID(String LossID) {
        this.LossID = LossID;
    }

    /**
     * @return the LossCostumer
     */
    public Date getLossCostumer() {
        return LossCostumer;
    }

    /**
     * @param LossCostumer the LossCostumer to set
     */
    public void setLossCostumer(Date LossCostumer) {
        this.LossCostumer = LossCostumer;
    }

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
     * @return the LossDate
     */
    public Date getLossDate() {
        return LossDate;
    }

    /**
     * @param LossDate the LossDate to set
     */
    public void setLossDate(Date LossDate) {
        this.LossDate = LossDate;
    }
}
