/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dto;

/**
 *
 * @author DEll
 */
public class CourseDTO extends SuperDTO{
    private int cid;
    private String name;
    private String type;
    private String duration;
    private double regFee;
    private double fee;
    private String discount;
    private String tax;
    private double transferFee;

    public CourseDTO() {
    }

    public CourseDTO(int cid,String name, String type, String duration, double regFee, double fee, String discount, String tax, double transferFee) {
        this.cid = cid;
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.regFee = regFee;
        this.fee = fee;
        this.discount = discount;
        this.tax = tax;
        this.transferFee = transferFee;
    }
    public CourseDTO(String name, String type, String duration, double regFee, double fee, String discount, String tax, double transferFee) {
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.regFee = regFee;
        this.fee = fee;
        this.discount = discount;
        this.tax = tax;
        this.transferFee = transferFee;
    }
    public CourseDTO(int cid,String name, String type, String duration, double regFee, double fee, String discount, String tax) {
        this.cid = cid;
        this.name = name;
        this.type = type;
        this.duration = duration;
        this.regFee = regFee;
        this.fee = fee;
        this.discount = discount;
        this.tax = tax;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
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
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * @return the discount
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    /**
     * @return the tax
     */
    public String getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * @return the transferFee
     */
    public double getTransferFee() {
        return transferFee;
    }

    /**
     * @param transferFee the transferFee to set
     */
    public void setTransferFee(double transferFee) {
        this.transferFee = transferFee;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public int getCid() {
        return cid;
    }

    
    
}
