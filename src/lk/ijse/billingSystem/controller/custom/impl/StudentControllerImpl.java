/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import lk.ijse.billingSystem.controller.custom.StudentController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.StudentDao;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public class StudentControllerImpl implements StudentController{
private final StudentDao studentDao;

    public StudentControllerImpl() {
        studentDao=(StudentDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.STUDENT);
    }

    
    @Override
    public StudentDTO searchStudent(String nic) throws Exception {
        return studentDao.search(nic);
    }

    @Override
    public StudentDTO searchByRid(String id) throws Exception {
        return studentDao.searchByName(id);
    }
    
}
