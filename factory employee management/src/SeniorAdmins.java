/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SeniorAdmins extends Admins {

	@Override
	void chceckWorkingWay(Work w) {
		if (w.status.equals("Good")) {
			System.out.println("Thanks");
		}
	}
}