package projectmangement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Manager objMgr=new Manager();
     System.out.println("input one manager info: ");
     objMgr.inputAll();
     int noOfDev=3;
     Developer objDev[] = new Developer[noOfDev];
      for (int i = 0; i < noOfDev; i++) {
       System.out.println("input info for dev: "+(i+1));
       objDev[i]= new Developer();
       objDev[i].inputAll();
      }
      
      Projects objPro=new Projects();
      objPro.inputInfo();
      
      // assign project to manager
      objMgr.assignProId(objPro.ProId);
      
      // take input from manager // how many dev assign to project
      System.out.println("Enter developer number for the project:");
      Scanner input= new Scanner(System.in);
      int devNo=input.nextInt();
      objPro.devNoAssignByManger(devNo);
      
      for (int i = 0; i < devNo; i++) {
          System.out.println("Enter Dev Id who will assigned: ");     
          int id=input.nextInt();
          
          for (int j = 0; j < noOfDev; j++) {
               if(objDev[j].PId==id){
                 objPro.setDevId(id);
                 break;
               }
          }
      }
      
        for (int i = 0; i < devNo; i++) {
           System.out.println("enter dev response 'true' or false");
            boolean choose=input.nextBoolean();
            objPro.notifycomplete(choose);
        }
        
        // manager will check developers feedback
        objPro.develperFeedback();
        
    }}