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
public class Electric_Bills extends Bills{
    public double electric_charge;
    
    public void print_elec(){
        System.out.println("Electric bill will be "+(total_bill+electric_charge));
    }
}
