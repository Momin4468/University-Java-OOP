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
public class Bills {
    public String month_name;
    public String type;
    public double amount;
    public double percent;
    public double total_bill;
    
    public void cal(){
        total_bill = amount*percent;
    }
    
    public void print(){
        System.out.println("Total Bill for month: "+month_name+" is: "+ total_bill);
    }
}
