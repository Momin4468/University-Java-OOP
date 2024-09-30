
package piazzadeliverysystem;

public class PizzaDecorator implements IPizza{
    IPizza withAddOn;
    PizzaDecorator(IPizza w){
	withAddOn=w;
    }
	
    public int getPrice(){
	return withAddOn.getPrice();
    }
}


/*
Objective of using decorator DP:
to remove calculations and logical tasks from the client class


*/