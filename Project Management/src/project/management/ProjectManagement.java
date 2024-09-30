package project.management;

import java.util.Scanner;

public class ProjectManagement {

    public static void main(String[] args) {
     Project_manager objMngr=new Project_manager();
     System.out.println("input one manager info: ");
     objMngr.input_all();
     int noofdev=3;
     Developer objDev[] = new Developer[noofdev];
      for (int i = 0; i < noofdev; i++) {
       System.out.println("input info for developer: "+(i+1));
       objDev[i]= new Developer();
       objDev[i].input_all();
      }
      
      Project objPro=new Project();
      objPro.input_all();
      
      objMngr.assignproid(objPro.proid);
      
      System.out.println("Enter developer number for the project:");
      Scanner input= new Scanner(System.in);
      int devNo=input.nextInt();
      objPro.devassign(devNo);
      
      for (int i = 0; i < devNo; i++) {
          System.out.println("Enter Dev Id who will assigned: ");     
          int id=input.nextInt();
          
          for (int j = 0; j < noofdev; j++) {
               if(objDev[j].devid==id){
                 objPro.setdevid(id);
                 break;
               }
          }
      }
      
        for (int i = 0; i < devNo; i++) {
           System.out.println("enter developer response 'true' or false");
            boolean choose=input.nextBoolean();
            objPro.notifycomplete(choose);
        }
        
        objPro.devfeedback();
        
    }
}
    
 
