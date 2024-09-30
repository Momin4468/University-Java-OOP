
package demo4;

public class Admin {
    String work_status;
    String performance;
    
    void giveswaiver(student obj){
        if(obj.cgpa>3.8)
        System.out.println("10% waiver will be given to students.");
        else 
        System.out.println("No waiver will be given to students.");    
    }
}
