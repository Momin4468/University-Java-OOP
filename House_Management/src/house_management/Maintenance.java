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
public class Maintenance {
    public int staff_no;
    public String staff_name;
    public double staff_salary;
    public double hours;
    public double rate;
    
    public void sal(){
        staff_salary = hours * rate;
        System.out.println("Staff salary of "+staff_name+ " is: "+staff_salary);
    }
    
    public Maintenance(int i, String n, double h, double r){
        staff_no = i;
        staff_name = n;
        hours = h;
        rate = r;
    }
    void View(){ 
        Maintenance_DB_Singleton obj = Maintenance_DB_Singleton.getinstance();
        obj.RetrieveData();
    }
    
}
