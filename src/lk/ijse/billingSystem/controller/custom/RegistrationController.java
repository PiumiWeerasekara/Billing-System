/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;
import lk.ijse.billingSystem.dto.RegistrationDTO;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public interface RegistrationController extends SuperController{
    public boolean addRegistration(StudentDTO studentDTO,RegistrationDTO registrationDTO,Reg_CourseDTO reg_CourseDTO);
    
}
