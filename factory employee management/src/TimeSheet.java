/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TimeSheet {
   private String task;

	void setTask(String t) {
		task = t;
	}

	void checkCurrentWork(Work w) {
		if (w.status.equals("On going")) {
			task = "Do it fast";
			System.out.println(task);
		} else {
			task = w.status;
			System.out.println(w.status);
		}
	} 
}
