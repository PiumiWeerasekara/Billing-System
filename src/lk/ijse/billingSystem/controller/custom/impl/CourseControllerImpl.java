/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom.impl;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.custom.CourseController;
import lk.ijse.billingSystem.dao.DaoFactory;
import lk.ijse.billingSystem.dao.custom.CourseDao;
import lk.ijse.billingSystem.dto.CourseDTO;

/**
 *
 * @author DEll
 */
public class CourseControllerImpl implements CourseController{
    private final CourseDao courseDao;

    public CourseControllerImpl() {
        courseDao=(CourseDao) DaoFactory.getInstance().getDao(DaoFactory.DAOTypes.COURSE);
    }
    
    
    @Override
    public CourseDTO searchCourse(String name) throws Exception {
        return courseDao.searchByName(name);
    }

    @Override
    public ArrayList<CourseDTO> getCourses() throws Exception {
        return courseDao.getAll();
    }

    @Override
    public CourseDTO searchById(int id) throws Exception {
        return courseDao.searchById(id);
    }
    
}
