
package foodpanda;

public class heavymeals extends foodcls {
    protected String meal_type;
    
    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }
    
    public void print_meal(){
        System.out.println("meal type: "+meal_type);
    }

   
}
