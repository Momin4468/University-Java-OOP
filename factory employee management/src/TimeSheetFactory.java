/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TimeSheetFactory {
    public static TimeSheet getTimeSheet(String choice) {
		if(choice.equals("inprogress")) {
			return new InProgressTimeSheet();
		}else if(choice.equals("completed")) {
			return new CompletedTimeSheet();
		}else {
			return null;
		}
	}
}
