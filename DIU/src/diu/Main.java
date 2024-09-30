
package diu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
       
        System.out.println("Enter Employee ID: ");
        String E_id = input.nextLine();
        
        System.out.println("Enter employee mobile number: ");
        String E_num = input.nextLine();
        
        System.out.println("Enter Employee Basic Salary(weekly): ");
        double salary = input.nextDouble();
               
       Employee obj = new Employee(E_id,E_num,salary); 
       
        System.out.println("Enter Employee work hour(weekly): ");
        int hour = input.nextInt();
       
       if(hour==40){
        double sal = obj.phsalary(hour);
       }
       else if(hour>40){
        obj.overtime(hour);
       }
       
       obj.printAll();
       
    }
    
}
