
package beratejai;

public class Beratejai {

    public static void main(String[] args) {
        Summer sum = new Summer();
        winter win = new winter();
        traveller travel = new traveller();
        
        //Let's buy two summer packages for registered traveller
        System.out.println("For Summer season: ");
        sum.inputAll();
        sum.input_month();
        travel.set_type("Registered");
        travel.set_no(2);
        sum.printAll();
        sum.price_calc(travel.get_no());
        travel.registered(sum.get_price());    
        
        
        //Let's buy ten winter packages for unregistered traveller
        System.out.println("For Winter season: ");
        win.inputAll();
        win.input_season();
        travel.set_type("Unregistered");
        travel.set_no(10);
        win.printAll();
        win.price_calc(travel.get_no());
        travel.unregistered(win.get_price());
        
        
        /*The code below will be executed properly when array is used.Now it will 
        give same values for all packages.The code will be updated sooner.I just wrote the concept here.
        
        //If a user wants to see all january packages
        sum.set_available(5);
        sum.printJanuary();
        
        //If a user wants to see all New Year packages
        win.set_available(7);
        win.printNewYear();
        
        */
    }
    
}
