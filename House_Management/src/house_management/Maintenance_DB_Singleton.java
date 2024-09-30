/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house_management;

/**
 *
 * @author Z2M
 */
public class Maintenance_DB_Singleton {
    private static Maintenance_DB_Singleton obj = new Maintenance_DB_Singleton();
    private Maintenance_DB_Singleton(){
      
    }
    public static Maintenance_DB_Singleton getinstance(){
        return obj;
    }
 
    void SaveData(){
        System.out.println("Saving Data");
    }
    void RetrieveData(){
        System.out.println("Getting Data");
    }
    void DeleteData(){
        System.out.println("Deleting Data");
    }
     
}
