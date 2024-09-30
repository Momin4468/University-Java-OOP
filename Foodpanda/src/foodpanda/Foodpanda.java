
package foodpanda;
import java.util.Scanner;

public class Foodpanda {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        heavymeals food = new heavymeals();
        snacks tim = new snacks();
        customercls cus = new customercls();
        
        cus.inputAll();
        
        int q = inp.nextInt();
        tim.setTime(q);
        tim.showtime();
        
        food.inputall();
        
        int r = inp.nextInt();
        int f = food.available(q);        
        if(f==1){
            food.calculate();
            food.printAll();
            food.print_meal();
        }
         
    }
    
}
