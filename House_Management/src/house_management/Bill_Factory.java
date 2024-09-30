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
public class Bill_Factory {
    public static Bills getBill(String choice){
    if(choice.equals("Electric Bills")){
        return new Electric_Bills();
    }
    else if(choice.equals("Gas Bills")){
        return new Gas_Bills();
    }
    else if(choice.equals("Water Bills")){
        return new Water_Bills();
    }
    else{
        return null;
    }
 }
}
