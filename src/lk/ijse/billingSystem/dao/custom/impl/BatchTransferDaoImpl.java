/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.billingSystem.dao.custom.BatchTransferDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.TransferDTO;

/**
 *
 * @author DEll
 */
public class BatchTransferDaoImpl implements BatchTransferDao{

    @Override
    public boolean add(TransferDTO transferDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Transfer(RID,Previous_Batch,Current_Batch,T_Fee) values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, transferDTO.getRid());
        stm.setObject(2, transferDTO.getpBatch());
        stm.setObject(3, transferDTO.getcBatch());
        stm.setObject(4, transferDTO.gettFee());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TransferDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TransferDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TransferDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TransferDTO searchByName(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
