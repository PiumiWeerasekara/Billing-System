/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller;

import lk.ijse.billingSystem.controller.custom.impl.BatchControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.BatchTransferControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.CourseControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.PaymentControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.Reg_CourseControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.RegistrationControllerImpl;
import lk.ijse.billingSystem.controller.custom.impl.StudentControllerImpl;

/**
 *
 * @author DEll
 */
public class ControllerFactory {

    public enum ControllerTypes {

        STUDENT, REGISTRATION, REG_COURSE, PAYMENT, BATCH, COURSE,TRANSFER;
    }
    private static ControllerFactory controllerFactory;

    private ControllerFactory() {
    }

    public static ControllerFactory getInstance() {
        if (controllerFactory == null) {
            controllerFactory = new ControllerFactory();
        }
        return controllerFactory;
    }

    public SuperController getController(ControllerTypes type) {
        switch (type) {
            case STUDENT:
                return new StudentControllerImpl();
            case REGISTRATION:
                return new RegistrationControllerImpl();
            case REG_COURSE:
                return new Reg_CourseControllerImpl();
            case PAYMENT:
                return new PaymentControllerImpl();
            case COURSE:
                return new CourseControllerImpl();
            case BATCH:
                return new BatchControllerImpl();
                case TRANSFER:
                return new BatchTransferControllerImpl();
            default :
                return null;
        }
    }

}
