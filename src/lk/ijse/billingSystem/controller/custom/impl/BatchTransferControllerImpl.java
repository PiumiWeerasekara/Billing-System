/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import lk.ijse.billingSystem.controller.custom.BatchTransferController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.BatchTransferDao;
import lk.ijse.billingSystem.dto.TransferDTO;

/**
 *
 * @author DEll
 */
public class BatchTransferControllerImpl implements BatchTransferController{
    private final BatchTransferDao batchTransferDao;

    public BatchTransferControllerImpl() {
        batchTransferDao=(BatchTransferDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.TRANSFER);
    }

    @Override
    public boolean add(TransferDTO transferDTO) throws Exception {
        return batchTransferDao.add(transferDTO);
    }
    
}
