
package bashundhara;

public class Fun_GamesFactory {
    public static Fun_Factory_Games getFun(String Choice) { // factory method always has a parameter
        if (Choice.equals("Car Games")) {
            return new Car_Games();
        }
        else if (Choice.equals("VR_Games")) {
            return new VR_Games();
        }
        else if (Choice.equals("Child_Games")) {
            return new Child_Games();
        }
        else{
            return null;
        }
    }
}
