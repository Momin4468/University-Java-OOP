
package foodpanda;
import java.util.Scanner;

public class foodcls implements food{
   
     protected int id;
     protected String f_name;
     protected double f_cost;
     protected int avail_qty;
     protected int order_qty;
     protected double bill;
     protected String restaurant;
     
     Scanner inp = new  Scanner(System.in);

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getAvail_qty() {
        return avail_qty;
    }

    public void setAvail_qty(int avail_qty) {
        this.avail_qty = avail_qty;
    }

    public int getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(int order_qty) {
        this.order_qty = order_qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public double getF_cost() {
        return f_cost;
    }

    public void setF_cost(double f_cost) {
        this.f_cost = f_cost;
    }


    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
     
    @Override
    public void calculate() {
       bill = order_qty*f_cost; 
    }

    @Override
    public int available(int q) {
       if (q>avail_qty){
           System.out.println("Can't Supply that much....");
           return 0;
       }
       else{
           System.out.println("Food id ordered");
           return 1;
       }
    }
    
    public void printAll(){
        System.out.println("Food id: "+id);
        System.out.println("Food name: "+f_name);
        System.out.println("Food bill: "+bill);
        System.out.println("Restaurnat name: "+restaurant);
    }
    
    public void inputall(){
        id = inp.nextInt();
        f_name = inp.nextLine();
        inp.nextLine();
        f_cost = inp.nextDouble();
        avail_qty = inp.nextInt();
        order_qty = inp.nextInt();
        restaurant = inp.nextLine();
    }
}
