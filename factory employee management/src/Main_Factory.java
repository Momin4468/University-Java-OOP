/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Main_Factory {
    public static void main(String[] args) {
        //work
		Work work = WorkFactory.getWork();
		work.setStatus("On going");
		
		
		//TimeSheet
		TimeSheet time = TimeSheetFactory.getTimeSheet("inprogress");
		time.checkCurrentWork(work);
		
		//admin
		Admin me = ITaskFactory.getAdmin();
		me.setSerial(342);
		me.checkWorkProcess(work);
	
		//ITask
		ITask task = ITaskFactory.getITask("Admin");
		task.checkWorkProcess(work);
		
		//admins
		work.setStatus("Not Good");
		Admins admin = AdminFactory.getAdmins("Junior");
		admin.chceckWorkingWay(work);
    }
}
