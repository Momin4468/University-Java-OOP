/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class ITaskFactory {
    public static Admin getITask(String choice) {
		if (choice.equals("Admin")) {
			return new Admin();
		}else {
			return null;
		}
	}
	
	public static Admin getAdmin() {
		return new Admin();
	}
}
