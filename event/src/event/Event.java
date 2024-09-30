
package event;
import java.util.Scanner;

public class Event {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter Event ID: ");
        int E_id = input.nextInt();
        
        input.nextLine();
        System.out.println("Enter Event name: ");
        String E_name = input.nextLine();
        
        System.out.println("Enter Event type: ");
        String E_type = input.nextLine();
        
        double t_bill = 0.0;
        
       EventManagement obj = new EventManagement(E_id,E_name,E_type,t_bill); 
       
       if(E_type.equalsIgnoreCase("Seminar")){
          System.out.println("Enter number of participants: ");
          int participant = input.nextInt();
          obj.totalCost_Seminar(participant);
       }
       else if(E_type.equalsIgnoreCase("Workshop")){
          System.out.println("Enter number of participants: ");
          int participant = input.nextInt();
          
          System.out.println("Enter workshop duration (in hour): ");
          int hour = input.nextInt();
          
          obj.totalCost_Workshop(participant,hour);
       }
       
    }
    
}
