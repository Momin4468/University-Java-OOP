
package beratejai;
import java.util.Scanner;

public class traveller implements travellerInt {

    protected String tra_type;
    protected double discount;
    protected double price;
    protected int no_packs;
    Scanner inp = new Scanner(System.in);
    
    public void input_noPacks(){
        System.out.println("Enter no of packages you want: ");
        no_packs = inp.nextInt();
    }
    public void set_no(int n){
        no_packs = n;
    }
    public int get_no(){
        return no_packs;
    }
    public void input_type(){
        System.out.println("Enter traveller type: ");
        tra_type = inp.nextLine();
    }
    public void set_type(String n){
        tra_type = n;
    }
    
    @Override
    public void registered(double p) {
        System.out.println("As a registered member you will get 10% discount on your total price");
        System.out.println("Total price is: "+p);
        price  = p;
        discount  = p * 0.10;
        price = price - discount;
        System.out.println("Traveller type is: "+tra_type);
        System.out.println("Total price after discount is: "+price);   
    }

    @Override
    public void unregistered(double p) {
        System.out.println("As an unregistered member you will not get any discount on your total price.");
        System.out.println("Traveller type is: "+tra_type);
        System.out.println("Total price is: "+p);
    }
} 
