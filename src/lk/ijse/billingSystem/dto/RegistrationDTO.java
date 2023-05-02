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
public class RegistrationDTO extends SuperDTO{
    private String rid;
    private String RDate;
    private double regFee;
    private double tax;
    

    public RegistrationDTO() {
    }

    public RegistrationDTO(String rid, String RDate, double regFee, double tax) {
        this.rid = rid;
        this.RDate = RDate;
        this.regFee = regFee;
        this.tax = tax;
    }

    /**
     * @return the rid
     */
    public String getRid() {
        return rid;
    }

    /**
     * @param rid the rid to set
     */
    public void setRid(String rid) {
        this.rid = rid;
    }

    /**
     * @return the RDate
     */
    public String getRDate() {
        return RDate;
    }

    /**
     * @param RDate the RDate to set
     */
    public void setRDate(String RDate) {
        this.RDate = RDate;
    }

    /**
     * @return the regFee
     */
    public double getRegFee() {
        return regFee;
    }

    /**
     * @param regFee the regFee to set
     */
    public void setRegFee(double regFee) {
        this.regFee = regFee;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    
    
}

    