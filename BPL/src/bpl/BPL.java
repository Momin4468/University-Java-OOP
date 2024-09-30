
package bpl;

import java.util.Scanner;


public class BPL {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        Automation_System obj = new Automation_System();
        String type;
        int seat;
        
        
        System.out.println("Enter Ticket Type: ");
        type = input.nextLine();
        
        System.out.println("Enter number of seats: ");
        seat = input.nextInt();
        
        if(type.equalsIgnoreCase("Gallery")){
            obj.gallery(seat);
        }
        else{
            obj.grand(seat);
        }
        obj.grand(1000);
        obj.gallery(10000);
        obj.gallery(7000);
        obj.gallery(500);
        obj.gallery(500);
        obj.grand(2000);
        obj.gallery(100);
               
    }
    
}
