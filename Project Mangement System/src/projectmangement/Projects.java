
package projectmangement;

import java.util.Scanner;

public class Projects {
    protected int ProId;
    protected String ProTitle;
    protected int DevId[];
    protected boolean IsDone[];
    protected  int i=0;
    protected  int j=0;
   
    public Projects() {
    }
    
    public void inputInfo(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Project Id: ");
        ProId= input.nextInt();
        input.nextLine();
        System.out.println("Enter Project Title: ");
        ProTitle=input.nextLine();
    }
    
    public int getProId(){
     return ProId;
    }
    
    public void devNoAssignByManger(int noOfDeve){
        DevId=new int[noOfDeve];
        IsDone=new boolean[noOfDeve];
    }
    
    public void setDevId(int devId){
     DevId[i]=devId;
     IsDone[i]=false;
     i++;
    }
    
    public void notifycomplete(boolean v){
       IsDone[j++]=v;
    }
    
    public void develperFeedback(){
        for (int k = 0; k < DevId.length; k++) {
            System.out.println("Dev "+(k+1)+" response: ");
            System.out.println("Dev Id: "+DevId[k]);
            System.out.println("feedback: "+IsDone[k]);
        }
    }
}
