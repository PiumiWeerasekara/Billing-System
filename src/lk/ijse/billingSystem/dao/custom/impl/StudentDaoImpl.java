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
import lk.ijse.billingSystem.dao.custom.StudentDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.BatchDTO;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public boolean add(StudentDTO studentDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Student(S_Name,NIC,Address,Telephone,Email,DOB,Gender,School,HigherQulification,RID) values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, studentDTO.getName());
        stm.setObject(2, studentDTO.getNic());
        stm.setObject(3, studentDTO.getAddress());
        stm.setObject(4, studentDTO.getTelephone());
        stm.setObject(5, studentDTO.getEmail());
        stm.setObject(6, studentDTO.getDob());
        stm.setObject(7, studentDTO.getGender());
        stm.setObject(8, studentDTO.getSchool());
        stm.setObject(9, studentDTO.getHigherQulification());
        stm.setObject(10, studentDTO.getRid());
        int res = stm.executeUpdate();
        return res > 0;

    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(StudentDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentDTO search(String id) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select S_Name,RID from Student where NIC='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new StudentDTO(rst.getString("S_Name"),rst.getString("RID"));
        }
        return null;
    }

    @Override
    public ArrayList<StudentDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public StudentDTO searchByName(String id) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select S_Name,NIC,Telephone from Student where RID='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new StudentDTO(rst.getString("S_Name"),rst.getString("NIC"),rst.getString("Telephone"));
        }
        return null;
    }
}
