/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.billingSystem.dao.SuperDao;
import lk.ijse.billingSystem.dto.BatchDTO;
import lk.ijse.billingSystem.dto.StudentDTO;

/**
 *
 * @author DEll
 */
public interface BatchDao extends SuperDao<BatchDTO, String> {

    public ArrayList<BatchDTO> getAll(String branch, int cid) throws Exception;

    public BatchDTO getBatch(String branch, int cid) throws Exception;

    public BatchDTO searchById(int id) throws Exception;
}
