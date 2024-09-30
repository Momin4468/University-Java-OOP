
package demo4;

//Student class er obj banabo ai factory te
public class StudentFactory {
    
    public static student getStudent(String choice){
        if(choice.equals("Local Student")){
         // localstudent obj = new localstudent();
          return new localstudent();
        }
        else if(choice.equals("Foreign Student")){
         // foreignstudent obj = new foreignstudent();
          return new foreignstudent();
        }
        else{
          return null;
        }
    }
    
}
