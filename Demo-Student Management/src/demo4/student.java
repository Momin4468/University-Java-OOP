
package demo4;


public class student {
    String S_id;
    String name;
    double cgpa;


   /* student(String S_id, String name, double cgpa){
        this.S_id = S_id;
        this.name = name;
        this.cgpa = cgpa;
    }*/
    
    void viewpayment(){
        System.out.println(S_id + " "+ name + " payment is done");
    }
    void getclearance(){
        System.out.println("getting clearance");
    }
    
}
