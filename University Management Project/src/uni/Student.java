
package uni;


public class Student extends Person{
    
    int id;
    String course;
    
    void stdInfo(){
        System.out.println("Student ID:");
        id  = input.nextInt();
        input.nextLine();
        System.out.println("Enrolled course:");
        course = input.nextLine();
    }
    
    void printStd(){
        System.out.println("Student Information: ");
        printInfo();
        System.out.println("ID: "+id);
        System.out.println("Name of Enrolled Course: "+course);
    }

}
