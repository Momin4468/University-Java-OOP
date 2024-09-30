/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class JuniorAdmins extends Admins {

	@Override
	void chceckWorkingWay(Work w) {
        if(w.status.equals("Not Good")){
            System.out.println("Why!I'm not good");
         }
		
	}

}