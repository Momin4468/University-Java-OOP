
package ShareTrip;


public class OrganizeTour{
	public void organizeBaliTour(){
		BaliTour b1 = new BaliTour();
		b1.bookFlight();
		b1.bookHotel();
		b1.bookSightSeeing();
	}
	public void organizeParoTour(){
		ParoTour b1 = new ParoTour();
		b1.bookFlight();
		b1.bookHotel();
		b1.bookSightSeeing();
	}
	public void organizeAgraTour(){
		AgraTour b1 = new AgraTour();
		b1.bookFlight();
		b1.bookHotel();
		b1.bookSightSeeing();
	}
}

