
package event;

public class EventManagement {
    int EvId;
    String EvName;
    String EvType;
    double total_bill;
    
    public EventManagement(int i,String n,String t, double b){
        EvId = i;
        EvName = n;
        EvType = t;
        total_bill = b;
    }
    
    public void totalCost_Seminar(int p){
        if(p>=10 && p<=100){
            total_bill = p*200;
            System.out.println("Total bill for " +EvType+" is: "+total_bill);
        }
        else if(p>100){
            System.out.println("Participants must be below than 100");
        }
    }
    
     public void totalCost_Workshop(int p,int d){
        if(p==20 && d<6){
            total_bill = d*300;
            System.out.println("Total bill for " +EvType+" is: "+total_bill);
        }
        else{
            System.out.println("Company can't arrange workshop.");
        }
    }    
}
