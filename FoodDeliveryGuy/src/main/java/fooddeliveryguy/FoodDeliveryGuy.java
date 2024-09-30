
package fooddeliveryguy;
import java.util.Scanner;

public class FoodDeliveryGuy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int age = input.nextInt();
        String name = input.nextLine();
        
        DeliveryMan momin = new DeliveryMan();
        
        momin.setAge(age);
        momin.setName(name);
        
        momin.calculateMonthlySalary();
        momin.bonus();

         
    }
    
}
