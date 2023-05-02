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
public class Reg_CourseDTO extends SuperDTO {

    private int rcid;
    private String rid;
    private int cid;
    private int bid;
    private String totalFee;
    private double balance;
    private String pay_Detail;

    public Reg_CourseDTO() {
    }

    public Reg_CourseDTO(int rcid, String rid, int cid, int bid, String totalFee, double balance, String pay_Detail) {
        this.rcid = rcid;
        this.rid = rid;
        this.cid = cid;
        this.bid = bid;
        this.totalFee = totalFee;
        this.balance = balance;
        this.pay_Detail = pay_Detail;
    }

    public Reg_CourseDTO(int rcid, int cid, int bid, double balance, String pay_Detail) {
        this.rcid = rcid;
        this.cid = cid;
        this.bid = bid;
        this.balance = balance;
        this.pay_Detail = pay_Detail;
    }

    public Reg_CourseDTO(String rid, int cid, int bid, double balance, String pay_Detail) {
        this.rid = rid;
        this.cid = cid;
        this.bid = bid;
        this.balance = balance;
        this.pay_Detail = pay_Detail;
    }

    public Reg_CourseDTO(String rid) {
        this.rid = rid;
    }

    public Reg_CourseDTO(String rid, int bid) {
        this.rid = rid;
        this.bid = bid;
    }

    public Reg_CourseDTO(String rid, int cid, int bid) {
        this.rid = rid;
        this.cid = cid;
        this.bid = bid;
    }

    public Reg_CourseDTO(int rcid, int cid, int bid, double balance) {
        this.rcid = rcid;
        this.cid = cid;
        this.bid = bid;
        this.balance = balance;
    }

    public Reg_CourseDTO(int rcid, double balance, String pay_Detail) {
        this.rcid = rcid;
        this.balance = balance;
        this.pay_Detail = pay_Detail;
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
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
    }

    /**
     * @return the bid
     */
    public int getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(int bid) {
        this.bid = bid;
    }

    /**
     * @return the totalFee
     */
    public String getTotalFee() {
        return totalFee;
    }

    /**
     * @param totalFee the totalFee to set
     */
    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
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
     * @return the pay_Detail
     */
    public String getPay_Detail() {
        return pay_Detail;
    }

    /**
     * @param pay_Detail the pay_Detail to set
     */
    public void setPay_Detail(String pay_Detail) {
        this.pay_Detail = pay_Detail;
    }

    /**
     * @return the rcid
     */
    public int getRcid() {
        return rcid;
    }

    /**
     * @param rcid the rcid to set
     */
    public void setRcid(int rcid) {
        this.rcid = rcid;
    }
}
