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
public class Maintenance_Admin extends Maintenance{

    public Maintenance_Admin(int i, String n, double h, double r) {
        super(i, n, h, r);
    }
    void Add(){ 
        Maintenance_DB_Singleton obj = Maintenance_DB_Singleton.getinstance();
        obj.SaveData();
    }
    
    void Delete(){ 
        Maintenance_DB_Singleton obj = Maintenance_DB_Singleton.getinstance();
        obj.DeleteData();
    }
}
