
package demo4;


public class FacultyFactory {
    public static faculty getFaculty(String choice){
        if(choice.equals("Lecturer")){
        //  Lecturer obj = new Lecturer();
          return new Lecturer();
        }
        else if(choice.equals("Assistant Professor")){
         // Assis_Prof obj = new Assis_Prof();
          return new Assis_Prof();
        }
        else{
          return null;
        }
    }
}
