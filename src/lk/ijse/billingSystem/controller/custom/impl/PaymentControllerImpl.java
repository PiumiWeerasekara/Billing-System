/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.billingSystem.controller.custom.PaymentController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.PaymentDao;
import lk.ijse.billingSystem.dao.custom.Reg_CourseDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.PaymentDTO;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;

/**
 *
 * @author DEll
 */
public class PaymentControllerImpl implements PaymentController {

    private final PaymentDao paymentDao;
    private final Reg_CourseDao reg_CourseDao;

    public PaymentControllerImpl() {
        paymentDao = (PaymentDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.PAYMENT);
        reg_CourseDao = (Reg_CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.REG_COURSE);
    }

    @Override
    public boolean AddPayment(PaymentDTO paymentDTO, Reg_CourseDTO reg_CourseDTO) throws Exception {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);
            boolean isUpdate = reg_CourseDao.addPayment(reg_CourseDTO);
            if (isUpdate) {
                boolean isAdded = paymentDao.add(paymentDTO);

                if (isUpdate) {
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public boolean AddHalfPayment(PaymentDTO paymentDTO, Reg_CourseDTO reg_CourseDTO) throws Exception {
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();
            connection.setAutoCommit(false);
            boolean isUpdate = reg_CourseDao.update(reg_CourseDTO);
            if (isUpdate) {
                boolean isAdded = paymentDao.add(paymentDTO);

                if (isUpdate) {
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }

    @Override
    public PaymentDTO searchById(int rcid) throws Exception {
        return paymentDao.searchById(rcid);
    }
}
