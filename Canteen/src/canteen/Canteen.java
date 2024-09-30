/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canteen;



/**
 *
 * @author Z2M
 */
public class Canteen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       
        Customer obj = Customer_Factory.getCustomer("Teacher");
        obj.print();
    }
    
}
