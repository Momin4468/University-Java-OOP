package project.management;

import java.util.Scanner;

public class Project {
    protected int proid;
    protected String protitle;
    protected int devid[];
    protected boolean tf[];
    protected  int i,j;
    
    public void input_all(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Project Id: ");
        proid= input.nextInt();
        input.nextLine();
        System.out.println("Enter Project Title: ");
        protitle=input.nextLine();
    }
    
    public int getproid(){
     return proid;
    }
    
    public void setdevid(int Devid){
     devid[i]=Devid;
     tf[i]=false;
     i++;
    }
    
    public void devassign(int noofdev){
        devid=new int[noofdev];
        tf=new boolean[noofdev];
    }
    
    public void notifycomplete(boolean v){
       tf[j++]=v;
    }
    
    public void devfeedback(){
        for (int k = 0; k < devid.length; k++) {
            System.out.println("Developer "+(k+1)+" response: ");
            System.out.println("Developer Id: "+devid[k]);
            System.out.println("feedback: "+tf[k]);
        }
    }
}
