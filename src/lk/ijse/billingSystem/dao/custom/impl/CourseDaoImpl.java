/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.billingSystem.dao.custom.CourseDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.CourseDTO;

/**
 *
 * @author DEll
 */
public class CourseDaoImpl implements CourseDao{

    @Override
    public boolean add(CourseDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CourseDTO t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CourseDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CourseDTO> getAll() throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String SQL="Select * from Course";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        ArrayList<CourseDTO> alCourse=null;
        while (rst.next()) {            
            if (alCourse==null) {
                alCourse=new ArrayList<>();
            }
            CourseDTO courseDTO=new CourseDTO(Integer.parseInt(rst.getString("CID")), rst.getString("C_Name"), rst.getString("C_Type"), rst.getString("C_Duration"), Double.parseDouble(rst.getString("C_RegFee")), Double.parseDouble(rst.getString("C_Fee")), rst.getString("Discount"), rst.getString("Tax"), Double.parseDouble(rst.getString("Tranfer_Fee")));
            alCourse.add(courseDTO);
        }
        return alCourse;
    }

    @Override
    public CourseDTO searchByName(String name) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select CID,C_Name,C_Type,C_Duration,C_RegFee,C_Fee,Discount,Tax,Tranfer_Fee from Course where C_Name='"+name+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new CourseDTO(Integer.parseInt(rst.getString("CID")), rst.getString("C_Name"), rst.getString("C_Type"), rst.getString("C_Duration"), Double.parseDouble(rst.getString("C_RegFee")), Double.parseDouble(rst.getString("C_Fee")), rst.getString("Discount"), rst.getString("Tax"), Double.parseDouble(rst.getString("Tranfer_Fee")));
        }
        return null;
    }
     @Override
    public CourseDTO searchById(int id) throws Exception{
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select C_Name,C_Type,C_Duration,C_RegFee,C_Fee,Discount,Tax,Tranfer_Fee from Course where CID='"+id+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        if (rst.next()) {
            return new CourseDTO(rst.getString("C_Name"), rst.getString("C_Type"), rst.getString("C_Duration"), Double.parseDouble(rst.getString("C_RegFee")), Double.parseDouble(rst.getString("C_Fee")), rst.getString("Discount"), rst.getString("Tax"), Double.parseDouble(rst.getString("Tranfer_Fee")));
        }
        return null;
    }
    
}

