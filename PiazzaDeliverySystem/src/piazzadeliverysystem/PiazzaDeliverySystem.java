
package piazzadeliverysystem;

public class PiazzaDeliverySystem {

    public static void main(String[] args) {
        ChickenPizza CP = new ChickenPizza();
        MoreCheese m1 = new MoreCheese(CP);
        
        System.out.println(CP.getPrice() + 100 + 110);
        // evabe amr exttra cheese, sauce er price add kora wrong. 
        //Java te oshb kisui object. so class create krte hbe.
        
        
        System.out.println(CP.getPrice() + m1.getPrice());
        //ai class ta client class. r eshb hocceh business side theke vaabte hbe
        // client class e input nebe user theke. calculate or logical implementation krbe na ai class
        // aitai business logic.
        
        //main target -- remove calculations from this client class
        
    }
    
}
