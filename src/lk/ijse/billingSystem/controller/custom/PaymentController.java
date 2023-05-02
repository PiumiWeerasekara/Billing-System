/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.PaymentDTO;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;

/**
 *
 * @author DEll
 */
public interface PaymentController extends SuperController{
    public boolean AddPayment(PaymentDTO paymentDTOpaymentDTO,Reg_CourseDTO reg_CourseDTO) throws Exception;
    public boolean AddHalfPayment(PaymentDTO paymentDTO,Reg_CourseDTO reg_CourseDTO) throws Exception;
    public PaymentDTO searchById(int rcid) throws Exception;
}
