/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.dao;

import java.util.ArrayList;
import lk.ijse.billingSystem.dto.SuperDTO;

/**
 *
 * @author DEll
 */
public interface SuperDao<T extends SuperDTO,ID>{
    public boolean add(T t)throws Exception;
    public boolean delete(ID id)throws Exception;
    public boolean update(T t)throws Exception;
    public T search(ID id)throws Exception;
    public ArrayList<T> getAll()throws Exception;
    public T searchByName(ID id)throws Exception;
    //public ArrayList<T> getAll(String branch,int cid)throws Exception;
}
