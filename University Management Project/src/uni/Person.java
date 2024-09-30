
package uni;

import java.util.Scanner;


public class Person {
    
    Scanner input = new Scanner(System.in);
    
    String f_name;
    String l_name;
    String department;
    int age;
    
     void takeIn(){
        System.out.println("First name: ");
        f_name = input.nextLine();
        System.out.println("Last name: ");
        l_name = input.nextLine();
        System.out.println("Department: ");
        department = input.nextLine();
        System.out.println("Age: ");
        age = input.nextInt();
        
    }
    
     void printInfo(){
         System.out.println("First name: "+f_name);
         System.out.println("Last name: "+l_name);
         System.out.println("Department: "+department);
         System.out.println("Age: "+age);
     }
}
