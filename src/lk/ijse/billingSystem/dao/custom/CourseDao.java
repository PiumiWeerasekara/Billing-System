/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom;

import lk.ijse.billingSystem.dao.SuperDao;
import lk.ijse.billingSystem.dto.CourseDTO;

/**
 *
 * @author DEll
 */
public interface CourseDao extends SuperDao<CourseDTO, String>{
    public CourseDTO searchById(int id) throws Exception;
}
