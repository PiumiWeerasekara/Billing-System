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
public class TransferDTO extends SuperDTO{
    private int tid;
    private String rid;
    private String pBatch;
    private String cBatch;
    private double tFee;

    public TransferDTO() {
    }

    public TransferDTO(int tid, String rid, String pBatch, String cBatch, double tFee) {
        this.tid = tid;
        this.rid = rid;
        this.pBatch = pBatch;
        this.cBatch = cBatch;
        this.tFee = tFee;
    }
    public TransferDTO(String rid, String pBatch, String cBatch, double tFee) {
        this.rid = rid;
        this.pBatch = pBatch;
        this.cBatch = cBatch;
        this.tFee = tFee;
    }

    /**
     * @return the tid
     */
    public int getTid() {
        return tid;
    }

    /**
     * @param tid the tid to set
     */
    public void setTid(int tid) {
        this.tid = tid;
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
     * @return the pBatch
     */
    public String getpBatch() {
        return pBatch;
    }

    /**
     * @param pBatch the pBatch to set
     */
    public void setpBatch(String pBatch) {
        this.pBatch = pBatch;
    }

    /**
     * @return the cBatch
     */
    public String getcBatch() {
        return cBatch;
    }

    /**
     * @param cBatch the cBatch to set
     */
    public void setcBatch(String cBatch) {
        this.cBatch = cBatch;
    }

    /**
     * @return the tFee
     */
    public double gettFee() {
        return tFee;
    }

    /**
     * @param tFee the tFee to set
     */
    public void settFee(double tFee) {
        this.tFee = tFee;
    }
    
}
