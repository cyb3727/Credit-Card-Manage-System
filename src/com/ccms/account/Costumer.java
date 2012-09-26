/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ccms.account;

import java.util.Date;

/**
 *
 * @author hit-acm
 */
public class Costumer {

    private String CostumerID;
    private String ID;
    private String FirstName;
    private String SecondName;
    private String Gender;
    private Date Birthday;
    private String PhoneNumber;
    private String Address;
    private String EmailAddress;

    /**
     * @return the CostumerID
     */
    public String getCostumerID() {
        return CostumerID;
    }

    /**
     * @param CostumerID the CostumerID to set
     */
    public void setCostumerID(String CostumerID) {
        this.CostumerID = CostumerID;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the SecondName
     */
    public String getSecondName() {
        return SecondName;
    }

    /**
     * @param SecondName the SecondName to set
     */
    public void setSecondName(String SecondName) {
        this.SecondName = SecondName;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Birthday
     */
    public Date getBirthday() {
        return Birthday;
    }

    /**
     * @param Birthday the Birthday to set
     */
    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * @param PhoneNumber the PhoneNumber to set
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the EmailAddress
     */
    public String getEmailAddress() {
        return EmailAddress;
    }

    /**
     * @param EmailAddress the EmailAddress to set
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }
}
