
package beratejai;
import java.util.Scanner;

public abstract class packages implements packageInt {
    protected int pack_id;
    protected String pack_name;
    protected double pack_price;
    protected int pack_seat = 10;
    protected double total_price;
    protected int available_packs;
    Scanner inp = new Scanner(System.in);
    
    @Override
    public void inputAll() {
        System.out.println("Enter package id: ");
        pack_id = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter package name: ");
        pack_name = inp.nextLine();
        System.out.println("Enter package price: ");
        pack_price = inp.nextDouble();
        
    }

    @Override
    public void printAll() {
        System.out.println("Package id is: "+pack_id);
        System.out.println("Package name is: "+pack_name);
        System.out.println("Package price is: "+pack_price);
        
    }

    @Override
    public void price_calc( int packs) {
       total_price = packs * pack_price;
    }
    
    public void set_seat(int s){
        if(s<=pack_seat) pack_seat -= s;
        else System.out.println("Seat is not available for this package");
    }

    public double get_price(){
        return total_price;
    }
    
    public void set_available(int s){
        available_packs = s;
    }
    
}
