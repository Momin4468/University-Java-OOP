
public class Food {

	 String foodname;
	 int price, availability;
	
	public Food() {
		
	}
	public Food(String foodname,int price,int availability) {
		this.foodname=foodname;
		this.price=price;
		this.availability=availability;
	}
	
	
	public String toString() {
		return  foodname + "\nprice= " + price + "\navailability=" + availability;
	}
	
}
