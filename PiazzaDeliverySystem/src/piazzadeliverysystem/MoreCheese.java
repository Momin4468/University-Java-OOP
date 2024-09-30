
package piazzadeliverysystem;

/*
public class MoreCheese {
    public int getPrice(){
        return 100;
    }
    //ekhane IPizza implement korlam na kno?
    //karon object gular majhe is-A-relation nei.
    //though we are usuing same method here too.
//super diye parent class constructor e value pass hoy
}
*/

public class MoreCheese extends PizzaDecorator{
	MoreCheese(IPizza w){
	    super(w);
	}
	public int getPrice(){
	    return withAddOn.getPrice()+100;
	}
}