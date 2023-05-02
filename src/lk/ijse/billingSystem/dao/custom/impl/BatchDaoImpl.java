/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import lk.ijse.billingSystem.dao.custom.BatchDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.BatchDTO;

/**
 *
 * @author DEll
 */
public class BatchDaoImpl implements BatchDao{

    @Override
    public boolean add(BatchDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BatchDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Select * from Batch";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<BatchDTO> alBatch=null;
        while (rst.next()) {            
            if (alBatch==null) {
                alBatch=new ArrayList<>();
            }
            BatchDTO batchDTO=new BatchDTO(Integer.parseInt(rst.getString(("BID"))), rst.getString("B_Name"));
            alBatch.add(batchDTO);
        }
        return alBatch;
    }

    @Override
    public BatchDTO searchByName(String name) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select BID,CID,Install_Date from Batch where B_Name='"+name+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new BatchDTO(Integer.parseInt(rst.getString("BID")),Integer.parseInt(rst.getString("CID")),rst.getDate("Install_Date"));
        }
        return null;
    }

    @Override
    public ArrayList<BatchDTO> getAll(String branch, int cid) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Select * from Batch where Branch='"+branch+"' && CID='"+cid+"' order by BID desc limit 1";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<BatchDTO> alBatch=null;
        while (rst.next()) {            
            if (alBatch==null) {
                alBatch=new ArrayList<>();
            }
            BatchDTO batchDTO=new BatchDTO(Integer.parseInt(rst.getString(("BID"))), rst.getString("B_Name"));
            alBatch.add(batchDTO);
        }
        return alBatch;
    }

    @Override
    public BatchDTO getBatch(String branch, int cid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select BID,B_Name from Batch where CID='" + cid + "' && Branch='" + branch + "' order by BID desc limit 1";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new BatchDTO(Integer.parseInt(rst.getString("BID")), rst.getString("B_name"));
        }
        return null;
    }
    @Override
    public BatchDTO searchById(int id) throws Exception{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select B_Name,Branch,Start_Date,Install_Date,CID from Batch where BID='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new BatchDTO(rst.getString("B_Name"), rst.getString("Branch"), rst.getDate("Start_Date"), rst.getDate("Install_Date"), Integer.parseInt(rst.getString("CID")));
        }
        return null;
    }
}
