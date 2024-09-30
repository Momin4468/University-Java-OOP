/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShareTrip;

import java.util.Scanner;

/**
 *
 * @author DCL
 */
public class ShareTrip {
    public static void main(String args[]) {
                /*BaliTour b1 = new BaliTour();
		b1.bookFlight();
		b1.bookHotel();
		b1.bookSightSeeing();
		*/
                Scanner sc = new Scanner(System.in);
		OrganizeTour t1 = new OrganizeTour();
		System.out.println("Enter the city name: ");
		String choice = sc.next();
		if(choice.equals("Agra"))
			t1.organizeAgraTour();
		else if(choice.equals("Paro"))
			t1.organizeParoTour();
		else if(choice.equals("Bali"))
			t1.organizeBaliTour();
		else
			System.out.println("No booking done");
    }
}

