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
public class Customer_Factory {
    public static Customer getCustomer(String choice){
    if(choice.equals("Teacher")){
        return new Teacher();
    }
    else if(choice.equals("Student")){
        return new student();
    }
    else{
        return null;
    }
 }
}
