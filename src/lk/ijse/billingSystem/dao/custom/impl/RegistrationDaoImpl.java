/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import lk.ijse.billingSystem.dao.custom.RegistrationDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.RegistrationDTO;

/**
 *
 * @author DEll
 */
public class RegistrationDaoImpl implements RegistrationDao{

    @Override
    public boolean add(RegistrationDTO registrationDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Registration values(?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, registrationDTO.getRid());
        stm.setObject(2, registrationDTO.getRDate());
        stm.setObject(3, registrationDTO.getRegFee());
        stm.setObject(4, registrationDTO.getTax());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(RegistrationDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RegistrationDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RegistrationDTO searchByName(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
