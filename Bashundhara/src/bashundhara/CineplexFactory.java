
package bashundhara;

public class CineplexFactory {
    public static Cineplex getHall(String Choice) { // factory method always has a parameter
        if (Choice.equals("Normal Hall")) {
            return new Normal_Hall();
        }
        else if (Choice.equals("Hall 5")) {
            return new Hall_5();
        }
        else if (Choice.equals("Premium Hall")) {
            return new Premium_Hall();
        }
        else{
            return null;
        }
    }
}
