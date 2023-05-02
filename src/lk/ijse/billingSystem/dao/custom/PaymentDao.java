/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.dao.SuperDao;
import lk.ijse.billingSystem.dto.PaymentDTO;

/**
 *
 * @author DEll
 */
public interface PaymentDao extends SuperDao<PaymentDTO, String>{
    public PaymentDTO searchById(int rcid) throws Exception;
}
