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
public class Water_Bills extends Bills{
    public double Water_charge;
    
    public void print_water(){
        System.out.println("Water bill will be "+(total_bill+Water_charge));
    }
    
}
