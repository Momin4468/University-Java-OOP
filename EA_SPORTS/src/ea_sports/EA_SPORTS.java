
package ea_sports;

import java.util.Scanner;
import game.games;


public class EA_SPORTS {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Enter game id: ");
        int gi = input.nextInt();
        
        input.nextLine();
        System.out.println("Enter game name: ");
        String gn = input.nextLine();
        
        System.out.println("Enter platform name: ");
        String pn = input.nextLine();
        
        System.out.println("Enter company name: ");
        String cn = input.nextLine();
       
        games obj = new games(gi,gn,pn,cn);
        
        int m  = obj.m_type(gi);
        
        System.out.println("Enter number of games: ");
        int gnum = input.nextInt();
        int n =  obj.price(pn,gnum);
        System.out.println("So the price for "+gnum+" games is:  "+n+".");
        
    }    
}
