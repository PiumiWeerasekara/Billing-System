/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.billingSystem.dao.custom.PaymentDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.PaymentDTO;

/**
 *
 * @author DEll
 */
public class PaymentDaoImpl implements PaymentDao{

    @Override
    public boolean add(PaymentDTO paymentDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Payment(p_Date,nbt,discount,Amount,Paid,Balance,RCID) values(?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, paymentDTO.getPDate());
        stm.setObject(2, paymentDTO.getNbt());
        stm.setObject(3, paymentDTO.getDiscount());
        stm.setObject(4, paymentDTO.getAmount());
        stm.setObject(5, paymentDTO.getPaid());
        stm.setObject(6, paymentDTO.getBalance());
        stm.setObject(7, paymentDTO.getRcID());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PaymentDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO searchByName(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public PaymentDTO searchById(int rcid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select P_Date,Paid from Payment where  RCID='"+rcid+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {            
            
            return new PaymentDTO(rst.getDate("P_Date"),Double.parseDouble(rst.getString("Paid")));
        }
        return null;
    }
    
}
