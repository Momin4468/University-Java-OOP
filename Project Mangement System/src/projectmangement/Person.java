
package projectmangement;
import java.util.Scanner;

public class Person {
    protected int PId;
    protected String Name;
    protected void inputAll(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter ID: ");
        PId= input.nextInt();
        input.nextLine();
        System.out.println("Enter name: ");
        Name=input.nextLine();
    }
    protected void PrintInfo(){
     
    }
}
