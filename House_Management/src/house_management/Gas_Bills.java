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
public class Gas_Bills extends Bills{
    public double gas_charge;
    
    public void print_gas(){
        System.out.println("Gas bill will be "+(total_bill+gas_charge));
    }
    
}
