/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;

/**
 *
 * @author DEll
 */
public interface Reg_CourseController extends SuperController{
    public int searchRCID(String rid, int cid, int bid) throws Exception ;
    public boolean addReg_Course(Reg_CourseDTO reg_CourseDTO)throws Exception;
    public boolean update(Reg_CourseDTO reg_CourseDTO)throws Exception;
    public Reg_CourseDTO searchPaid(String rid,String state) throws Exception;
    public int searchBid(String rid, int cid) throws Exception;
    public ArrayList<Reg_CourseDTO> searchBid(int bid, String install) throws Exception;
    public ArrayList<Reg_CourseDTO> searchDetail(String rid) throws Exception;
    public boolean searchPayment(String rid, int bid) throws Exception;
}
