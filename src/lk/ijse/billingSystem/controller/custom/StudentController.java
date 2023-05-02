/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public interface StudentController extends SuperController{
    public StudentDTO searchStudent(String nic)throws Exception;
    public StudentDTO searchByRid(String id)throws Exception;
}
