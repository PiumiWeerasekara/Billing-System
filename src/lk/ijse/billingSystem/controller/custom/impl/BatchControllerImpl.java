/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.custom.BatchController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.BatchDao;
import lk.ijse.billingSystem.dto.BatchDTO;

/**
 *
 * @author DEll
 */
public class BatchControllerImpl implements BatchController{

    private final BatchDao batchDao;

    public BatchControllerImpl() {
        batchDao=(BatchDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.BATCH);
    }
    
    
    @Override
    public BatchDTO searchBatch(String name) throws Exception{
        return batchDao.searchByName(name);
    }

    @Override
    public ArrayList<BatchDTO> getBatches(String branch,int cid) throws Exception {
        return batchDao.getAll(branch, cid);
    }

    @Override
    public ArrayList<BatchDTO> getBatch() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO getBatch(String branch, int cid) throws Exception {
        return batchDao.getBatch(branch, cid);
    }

    @Override
    public BatchDTO searchById(int id) throws Exception {
        return batchDao.searchById(id);
    }
    
}
