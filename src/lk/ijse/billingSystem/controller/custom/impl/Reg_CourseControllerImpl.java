/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.custom.Reg_CourseController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.Reg_CourseDao;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;

/**
 *
 * @author DEll
 */
public class Reg_CourseControllerImpl implements Reg_CourseController {

    private final Reg_CourseDao reg_CourseDao;

    public Reg_CourseControllerImpl() {
        reg_CourseDao = (Reg_CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.REG_COURSE);
    }

    @Override
    public int searchRCID(String rid, int cid, int bid) throws Exception {
        return reg_CourseDao.searchRCID(rid, cid, bid);
    }

    @Override
    public boolean addReg_Course(Reg_CourseDTO reg_CourseDTO) throws Exception {
        return reg_CourseDao.add(reg_CourseDTO);
    }

    @Override
    public boolean update(Reg_CourseDTO reg_CourseDTO) throws Exception {
        return reg_CourseDao.update(reg_CourseDTO);
    }

    @Override
    public Reg_CourseDTO searchPaid(String rid, String state) throws Exception {
        return reg_CourseDao.searchPaid(rid, state);
    }

    @Override
    public int searchBid(String rid, int cid) throws Exception {
        return reg_CourseDao.searchBid(rid, cid);
    }

    @Override
    public ArrayList<Reg_CourseDTO> searchBid(int bid, String install) throws Exception {
        return reg_CourseDao.searchBid(bid, install);
    }

    @Override
    public ArrayList<Reg_CourseDTO> searchDetail(String rid) throws Exception {
        return reg_CourseDao.searchDetail(rid);
    }

    @Override
    public boolean searchPayment(String rid, int bid) throws Exception {
        return reg_CourseDao.searchPayment(rid, bid);
    }
}
