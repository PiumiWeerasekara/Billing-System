/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao;

import lk.ijse.billingSystem.dao.custom.impl.BatchDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.BatchTransferDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.CourseDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.PaymentDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.Reg_CourseDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.RegistrationDaoImpl;
import lk.ijse.billingSystem.dao.custom.impl.StudentDaoImpl;

/**
 *
 * @author DEll
 */
public class DaoFactory {

    public enum DAOTypes {

        STUDENT, REGISTRATION, PAYMENT, REG_COURSE, BATCH, COURSE,TRANSFER;
    }
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DaoFactory();
        }
        return daoFactory;
    }

    public SuperDao getDao(DAOTypes type) {
        switch (type) {
            case STUDENT:
                return new StudentDaoImpl();
            case REGISTRATION:
                return new RegistrationDaoImpl();
            case PAYMENT:
                return new PaymentDaoImpl();
            case REG_COURSE:
                return new Reg_CourseDaoImpl();
            case BATCH:
                return new BatchDaoImpl();
            case COURSE:
                return new CourseDaoImpl();
                case TRANSFER:
                    return new BatchTransferDaoImpl();
            default:
                return null;
        }
    }

}
