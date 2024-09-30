
package uni;

import java.util.Scanner;

public class Course {
    
    Scanner input = new Scanner(System.in);
    int a=0;
    String title;
    String code;
    int enrolled=0;
    int credit;
    String tch;
    
    void crsInfo(){
        System.out.println("Course Title:");
        title = input.nextLine();
        System.out.println("Course Code:");
        code = input.nextLine();
        System.out.println("Total credit hours:");
        credit = input.nextInt();
        
    }
    
    void enrol(){
        System.out.println("Press 1 to enroll a student. Any other number to stop enrolling");
        a = input.nextInt();
         while(a==1){
             enrolled+=1;
             System.out.println("Press 1 to enroll a student. Any other number to stop enrolling");
        a = input.nextInt();
         }
    }
    
    void assign(){
        input.nextLine();
        System.out.println("Enter a teacher's name to assign the course:");
        tch = input.nextLine();
        
    }
    
    void printCourse(){
        System.out.println("Course Information: ");
        System.out.println("Course Title: "+title);
        System.out.println("Course Code: "+code);
        System.out.println("Total Credit Hours: "+credit);
        System.out.println("Total Enrolled Student: "+enrolled);
        System.out.println("Assigned Teacher: "+tch);
    }
    
}
