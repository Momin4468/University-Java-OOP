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
public class Cleaning_Maintenance extends Maintenance{
    
    public double bonus_percent;

    public Cleaning_Maintenance(int i, String n, double h, double r) {
        super(i, n, h, r);
    }
    
    
    public void Print(){
        System.out.println("Staff Name: "+staff_name);
        staff_salary += (staff_salary*bonus_percent);
        System.out.println("Staff Salary: "+staff_salary);
    }
    
}
