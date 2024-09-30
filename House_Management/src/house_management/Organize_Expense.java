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
public class Organize_Expense {
        public void OrganizeHouse_Rent(){
		House_Rent E1 = new House_Rent();
		E1.print();
	}
	public void OrganizeGarge_Rent(){
		Garage_Rent E2 = new Garage_Rent();
		E2.print();
	}
	public void OrganizeElectric_Bills(){
		Electric_Bills E3 = new Electric_Bills();
                E3.cal();
		E3.print_elec();
	}
        public void OrganizeGas_Bills(){
		Gas_Bills E4 = new Gas_Bills();
                E4.cal();
		E4.print_gas();
	}
        public void OrganizeWater_Bills(){
		Water_Bills E5 = new Water_Bills();
                E5.cal();
		E5.print_water();
	}
        
}
