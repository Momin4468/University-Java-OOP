/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

/**
 *
 * @author DCL
 */
public class User {
    void save(){
        //DBConnection obj = new DBConnection();
        DBConnection obj = DBConnection.getInstance();
        obj.saveData();
        
    }
}
