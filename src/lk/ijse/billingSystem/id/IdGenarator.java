/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.billingSystem.id;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author DEll
 */
public class IdGenarator {
   public static String getNewID(String tblName, String colName, String prefix) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        String lastId = IdController.getLastID(tblName, colName);
        String newId;
        if (lastId != null) {
            String Id="";
            char[] reg=lastId.toCharArray();
            for(int i=1;i<reg.length;i++){
                Id+=reg[i];
            }
            int r=Integer.parseInt(Id);
            if(r<9){
                newId= prefix+"00"+(r+1);
            }else if(r<99){
                newId= prefix+"0"+(r+1);
            }else
                newId= prefix+(r+1);
        }else{
            newId = prefix+"001";
        }
        return newId;
    }
    
    public static String getNewID(String lastId, String prefix){
        String Id="";
        char[] reg=lastId.toCharArray();
        for(int i=1;i<reg.length;i++){
            Id+=reg[i];
        }
        int r=Integer.parseInt(Id);
        if(r<9){
            return prefix+"00"+(r+1);
        }else if(r<99){
            return prefix+"0"+(r+1);
        }
        return prefix+(r+1);
    }
    
}
