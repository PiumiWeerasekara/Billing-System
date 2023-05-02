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
public class BatchDTO extends SuperDTO{
    private int bid;
    private String name;
    private String branch;
    private Date start_Date;
    private Date install_Date;
    private int cid;

    public BatchDTO() {
    }

    public BatchDTO(int bid, String name, String branch, Date start_Date, Date install_Date, int cid) {
        this.bid = bid;
        this.name = name;
        this.branch = branch;
        this.start_Date = start_Date;
        this.install_Date = install_Date;
        this.cid = cid;
    }
    public BatchDTO(String name, String branch, Date start_Date, Date install_Date, int cid) {
        this.name = name;
        this.branch = branch;
        this.start_Date = start_Date;
        this.install_Date = install_Date;
        this.cid = cid;
    }

    
     public BatchDTO(int bid, int cid,Date install_Date) {
        this.bid = bid;
        this.cid = cid;
        this.install_Date=install_Date;
    }
     public BatchDTO(int bid, String name) {
        this.bid = bid;
        this.name = name;
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
     * @return the branch
     */
    public String getBranch() {
        return branch;
    }

    /**
     * @param branch the branch to set
     */
    public void setBranch(String branch) {
        this.branch = branch;
    }

    /**
     * @return the start_Date
     */
    public Date getStart_Date() {
        return start_Date;
    }

    /**
     * @param start_Date the start_Date to set
     */
    public void setStart_Date(Date start_Date) {
        this.start_Date = start_Date;
    }

    /**
     * @return the install_Date
     */
    public Date getInstall_Date() {
        return install_Date;
    }

    /**
     * @param install_Date the install_Date to set
     */
    public void setInstall_Date(Date install_Date) {
        this.install_Date = install_Date;
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

}
