
package fooddeliveryguy;


public class DeliveryMan {
    int age;
    String name;
    int totalDelivered;
    int salary;
    int bonus;
    
   //getter method 
    public int getAge() {
    return age;
   }

    public String getName() {
    return name;
    }
    
    // Setter method
    public void setName(String name) {
      this.name = name;
    }
    
    public void setAge(int age){
      this.age = age;
    }
    
    public int calculateMonthlySalary(){
        salary = totalDelivered * 30 * 22;
        return salary;
    }
    
    public int bonus(){
        if(totalDelivered>800){
            bonus = 3000;
        }
        else{
            bonus = 0;
        }
        return bonus;
    }
    
}
