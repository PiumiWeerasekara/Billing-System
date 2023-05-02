/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.TransferDTO;

/**
 *
 * @author DEll
 */
public interface BatchTransferController extends SuperController{
    public boolean add(TransferDTO transferDTO) throws Exception;
}
