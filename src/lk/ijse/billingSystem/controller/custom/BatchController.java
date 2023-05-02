/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.controller.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.controller.SuperController;
import lk.ijse.billingSystem.dto.BatchDTO;

/**
 *
 * @author DEll
 */
public interface BatchController extends SuperController{
    public BatchDTO searchBatch(String name)throws Exception;
    public ArrayList<BatchDTO> getBatch()throws Exception;
    public ArrayList<BatchDTO> getBatches(String branch,int cid)throws Exception;
    public BatchDTO getBatch(String branch, int cid) throws Exception;
    public BatchDTO searchById(int id) throws Exception;
}
