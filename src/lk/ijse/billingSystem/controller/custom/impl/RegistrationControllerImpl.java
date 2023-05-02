/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.billingSystem.controller.custom.RegistrationController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.Reg_CourseDao;
import lk.ijse.billingSystem.dao.custom.RegistrationDao;
import lk.ijse.billingSystem.dao.custom.StudentDao;
import lk.ijse.billingSystem.db.DBConnection;
import lk.ijse.billingSystem.dto.Reg_CourseDTO;
import lk.ijse.billingSystem.dto.RegistrationDTO;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public class RegistrationControllerImpl implements RegistrationController {

    private final Reg_CourseDao reg_CourseDao;
    private final RegistrationDao registrationDao;
    private final StudentDao studentDao;

    public RegistrationControllerImpl() {
        this.reg_CourseDao = (Reg_CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.REG_COURSE);
        this.registrationDao = (RegistrationDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.REGISTRATION);
        this.studentDao = (StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.STUDENT);
    }

    @Override
    public boolean addRegistration(StudentDTO studentDTO, RegistrationDTO registrationDTO, Reg_CourseDTO reg_CourseDTO) {
        Connection connection = null;

        try {
            connection = DBConnection.getInstance().getConnection();

            connection.setAutoCommit(false);

            boolean isRegister = registrationDao.add(registrationDTO);
            if (isRegister) {
                boolean isAdded = studentDao.add(studentDTO);
//                if (isAdded) {
//                    boolean isDetailAdded = reg_CourseDao.add(reg_CourseDTO);
//                }
                if (isAdded) {
                    connection.commit();
                    return true;
                }
            }
            connection.rollback();
            return false;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } catch (IOException ex) {
            Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(RegistrationControllerImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
}
