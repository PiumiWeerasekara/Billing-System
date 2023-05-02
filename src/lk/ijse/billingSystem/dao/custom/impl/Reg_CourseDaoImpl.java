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
import lk.ijse.billingSystem.dao.custom.Reg_CourseDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;

/**
 *
 * @author DEll
 */
public class Reg_CourseDaoImpl implements Reg_CourseDao {

    @Override
    public boolean add(Reg_CourseDTO reg_CourseDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Reg_Course(RID,CID,BID) values(?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, reg_CourseDTO.getRid());
        stm.setObject(2, reg_CourseDTO.getCid());
        stm.setObject(3, reg_CourseDTO.getBid());
        int res = stm.executeUpdate();
        return res > 0;
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Reg_CourseDTO reg_CourseDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Update Reg_Course set Balance='"+reg_CourseDTO.getBalance()+"',Pay_Detail='"+reg_CourseDTO.getPay_Detail()+"' where RCID='"+reg_CourseDTO.getRcid()+"'";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(sql);
        return res > 0;
    }

    @Override
    public Reg_CourseDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Reg_CourseDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reg_CourseDTO searchByName(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int searchRCID(String rid, int cid, int bid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select RCID from Reg_Course where RID='"+rid+"' && CID='" + cid + "' && BID='" + bid + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return Integer.parseInt(rst.getString("RCID"));
        }
        return 0;
    }
    @Override
    public Reg_CourseDTO searchPaid(String rid,String state) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select RCID,CID,BID,Balance from Reg_Course where RID='"+rid+"' && Pay_Detail='"+state+"'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return new Reg_CourseDTO(Integer.parseInt(rst.getString("RCID")), Integer.parseInt(rst.getString("CID")), Integer.parseInt(rst.getString("BID")),Double.parseDouble(rst.getString("Balance")));
        }
        return null;
    }
    @Override
    public boolean addPayment(Reg_CourseDTO reg_CourseDTO) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Insert into Reg_Course(RID,CID,BID,Balance,Pay_Detail) values(?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1, reg_CourseDTO.getRid());
        stm.setObject(2, reg_CourseDTO.getCid());
        stm.setObject(3, reg_CourseDTO.getBid());
        stm.setObject(4, reg_CourseDTO.getBalance());
        stm.setObject(5, reg_CourseDTO.getPay_Detail());
        int res = stm.executeUpdate();
        return res > 0;
    }
    @Override
    public int searchBid(String rid, int cid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select BID from Reg_Course where RID='"+rid+"' && CID='" + cid + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
        if (rst.next()) {
            return Integer.parseInt(rst.getString("BID"));
        }
        return 0;
       
    }
    @Override
    public ArrayList<Reg_CourseDTO> searchBid(int bid, String install) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select RID from Reg_Course where  BID='"+bid+"' && Pay_Detail='"+install+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<Reg_CourseDTO> alReg_Courses=null;
        while (rst.next()) {            
            if (alReg_Courses==null) {
                alReg_Courses=new ArrayList<>();
            }
            Reg_CourseDTO Reg_CourseDTO=new Reg_CourseDTO(rst.getString("RID"));
            alReg_Courses.add(Reg_CourseDTO);
        }
        return alReg_Courses;
       
    }
    @Override
    public ArrayList<Reg_CourseDTO> searchDetail(String rid) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "Select RCID,CID,BID,Balance,Pay_Detail from Reg_Course where  RID='"+rid+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<Reg_CourseDTO> alReg_Courses=null;
        while (rst.next()) {            
            if (alReg_Courses==null) {
                alReg_Courses=new ArrayList<>();
            }
            Reg_CourseDTO Reg_CourseDTO=new Reg_CourseDTO(Integer.parseInt(rst.getString("RCID")),Integer.parseInt(rst.getString("CID")),Integer.parseInt(rst.getString("BID")),Double.parseDouble(rst.getString("Balance")),rst.getString("Pay_Detail"));
            alReg_Courses.add(Reg_CourseDTO);
        }
        return alReg_Courses;
       
    }

    @Override
    public boolean searchPayment(String rid, int bid) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql="Select * from Reg_Course where RID='"+rid+"' && BID='"+bid+"'";
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery(sql);
        return rst.next();
    }
    

}
