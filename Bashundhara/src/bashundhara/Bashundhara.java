/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bashundhara;

/**
 *
 * @author User
 */
public class Bashundhara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cineplex Hall_5 = CineplexFactory.getHall("Hall 5");
        Hall_5.opening_time();
       
        Cineplex Premium = CineplexFactory.getHall("Premium Hall");
        Premium.Closing_time();
        
        Cineplex Normal = CineplexFactory.getHall("Normal Hall");
        Normal.calculate_price(2);  //2 is number of tickets
        
        Fun_Factory_Games VR = Fun_GamesFactory.getFun("VR_Games");
        VR.opening_time();
        
        Fun_Factory_Games Child = Fun_GamesFactory.getFun("Child_Games");
        Child.Closing_time();
        
        Fun_Factory_Games Car = Fun_GamesFactory.getFun("Car_Games");
        Car.calculate_price(1.5); //1.5 means 90 minutes
        
    }
    
}
