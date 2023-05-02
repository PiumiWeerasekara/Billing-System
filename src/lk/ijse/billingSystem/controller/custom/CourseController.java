/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.CourseDTO;

/**
 *
 * @author DEll
 */
public interface CourseController extends SuperController {
    public CourseDTO searchCourse(String name) throws Exception;
    public ArrayList<CourseDTO> getCourses() throws Exception;
    public CourseDTO searchById(int id) throws Exception;
}
