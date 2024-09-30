
package triangle1;

import java.util.Scanner;

public class Triangle1 {

    public static void main(String[] args) {
     Scanner input  = new Scanner(System.in);   
     
     System.out.println("Enter Height: ");
     double h = input.nextDouble();
     System.out.println("Enter Base: ");
     double w = input.nextDouble(); 
     
     Triangle1 obj = new Triangle1();
     double otivuj = obj.calculate(h,w);
     System.out.println("The length of hypotenuse: "+otivuj);
    }
    
    public double calculate(double h,double w){
        double otivuj = Math.sqrt((h*h)+(w*w));
        return otivuj;
    }
}
