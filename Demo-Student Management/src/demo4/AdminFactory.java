
package demo4;


public class AdminFactory {
    public static Admin getAdmin(String choice){
        if(choice.equals("Moderator")){
         // Moderator obj = new Moderator();
          return new Moderator();
        }
        
        else{
          return null;
        }
    }
}
