
package bpl;

public class Automation_System {
    
    String type;
    int seat;
    int TGALLERY = 8000;
    int TGRAND = 10000;
    
    public void setvalue(String t,int s){
        String type = t;
        int seat = s;
        
    }
    
    public void gallery(int s){
        if(s<=TGALLERY){
            System.out.println("Ticket Availale");
            TGALLERY -=s;
        } 
        else{
            System.out.println("All tickets are sold");
        }
    }
    
    public void grand(int s){
        if(s<=TGRAND){
            System.out.println("Ticket Availale");
            TGRAND -=s;
        }  
        else{
            System.out.println("All tickets are sold");
        }
    }
}
