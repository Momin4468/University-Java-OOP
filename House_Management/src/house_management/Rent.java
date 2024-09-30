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
public class Rent {
    public int house_no;
    public double house_size;
    public double price;
    public double total_rent;
    
    public void cal(){
        total_rent = house_size*price;
    }
}
