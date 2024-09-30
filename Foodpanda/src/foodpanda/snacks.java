
package foodpanda;

public class snacks extends foodcls {
    protected int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public void showtime(){
        if(time<12 && time>6) System.out.println("Breakfast foods are available..");
        else if(time<17 && time>13) System.out.println("Lunch meals are available..");
        else if(time<20 && time>18) System.out.println("Snacks are available..");
        else  System.out.println("Dinner meals are available..");
        
         System.out.println("Order accroding the available meal....");
    }

   
    
}
