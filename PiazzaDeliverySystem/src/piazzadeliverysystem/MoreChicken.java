
package piazzadeliverysystem;

/*
public class MoreChicken {
    public int getPrice(){
        return 100;
    }
}
*/

public class MoreChicken extends PizzaDecorator{
	MoreChicken(IPizza w){
	    super(w);
	}
	public int getPrice(){
	    return withAddOn.getPrice()+150;
	}
}