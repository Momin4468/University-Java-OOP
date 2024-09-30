/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class AdminFactory {
    public static Admins getAdmins(String choice) {
		if(choice.equals("Senior")) {
			return new SeniorAdmins();
		}else if(choice.equals("Junior")) {
			return new JuniorAdmins();
		}else {
			return null;
		}
    }
}
