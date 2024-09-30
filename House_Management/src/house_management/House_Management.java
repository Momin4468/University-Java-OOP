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
import java.util.Scanner;


public class House_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        //Implementation of Factory Method
        Bills B_Elec = Bill_Factory.getBill("Electric Bills");
        //We can get the object for Gas bills and Water Bills classes by using their names in this getBill method.
        System.out.println("Implementation of Factory Method (Values Given)");
        B_Elec.month_name = "July";
        B_Elec.type = "Electric";
        B_Elec.amount = 100.0;
        B_Elec.percent = 2.5;
        B_Elec.cal();
        B_Elec.print();
             
        System.out.println();  
       
        
        //Implementation of Singleton on Maintenance.
        System.out.println("Implementation of Singleton (Values Given)");
        Electric_Maintenance m = new Electric_Maintenance(1,"momin",10,5);
        m.View();
        
        Maintenance_Admin am = new Maintenance_Admin(2,"zihad",10,5);
        am.Add();
        am.Delete();
        
        System.out.println();       
        
        
        //Implementation of Facade
        System.out.println("Implementation of Facade (No values Assigned)");
        Organize_Expense OE = new Organize_Expense();
	System.out.println("Enter the Expense name: ");
	String choice = input.nextLine();
	if(choice.equalsIgnoreCase("House Rents"))
		OE.OrganizeHouse_Rent();
	else if(choice.equalsIgnoreCase("Garage Rents"))
		OE.OrganizeGarge_Rent();
	else if(choice.equalsIgnoreCase("Electric Bills"))
		OE.OrganizeElectric_Bills();
        else if(choice.equalsIgnoreCase("Gas Bills"))
		OE.OrganizeGas_Bills();
        else if(choice.equalsIgnoreCase("Water Bills"))
		OE.OrganizeWater_Bills();
	else
		System.out.println("No Expenses Chosen");
        
        
        System.out.println();
        System.out.println("Thank You."); 
        
    }
    
}
