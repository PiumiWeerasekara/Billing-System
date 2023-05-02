/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dto;

import java.util.Date;

/**
 *
 * @author DEll
 */
public class PaymentDTO extends SuperDTO {

    private Date PDate;
    private double nbt;
    private double discount;
    private double amount;
    private double paid;
    private Date due_Date;
    private double balance;
    private int rcID;

    public PaymentDTO() {
    }

    public PaymentDTO(Date PDate, double nbt, double discount, double amount, double paid, double balance, int rcID) {
        this.PDate = PDate;
        this.nbt = nbt;
        this.discount = discount;
        this.amount = amount;
        this.paid = paid;
        this.balance = balance;
        this.rcID = rcID;
    }

    

    public PaymentDTO(Date PDate, double nbt, double discount, double amount, double balance, int rcID) {
        this.PDate = PDate;
        this.nbt = nbt;
        this.discount = discount;
        this.amount = amount;
        this.balance = balance;
        this.rcID = rcID;
    }
    public PaymentDTO(Date PDate, double paid) {
        this.PDate = PDate;
        this.paid = paid;
    }


    /**
     * @return the PDate
     */
    public Date getPDate() {
        return PDate;
    }

    /**
     * @param PDate the PDate to set
     */
    public void setPDate(Date PDate) {
        this.PDate = PDate;
    }

    /**
     * @return the nbt
     */
    public double getNbt() {
        return nbt;
    }

    /**
     * @param nbt the nbt to set
     */
    public void setNbt(double nbt) {
        this.nbt = nbt;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the paid
     */
    public double getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(double paid) {
        this.paid = paid;
    }

    /**
     * @return the due_Date
     */
    public Date getDue_Date() {
        return due_Date;
    }

    /**
     * @param due_Date the due_Date to set
     */
    public void setDue_Date(Date due_Date) {
        this.due_Date = due_Date;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the rcID
     */
    public int getRcID() {
        return rcID;
    }

    /**
     * @param rcID the rcID to set
     */
    public void setRcID(int rcID) {
        this.rcID = rcID;
    }

  

}
