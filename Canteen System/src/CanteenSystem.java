import java.util.*;

import javax.swing.JOptionPane;

import java.io.*;

public class CanteenSystem {

	static int Author_PIN=1234;
	static int NSUer_PIN=1234;
	static int token=0;
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		
		
		
			
		try { //if input anything else other than integer
			outer: //to break out of the loop
			for(;;) {
				System.out.println("1.Author \n2.NSUer \n3.Exit");
				int choice=s.nextInt();
				
			if(choice==1||choice==2||choice==3) {	
			switch(choice){
			case 1:
				int a=1;
				
				pinchecker:
					
				while(a==1) {
				
					System.out.println("Enter the PIN");
					int pin=s.nextInt();
					
						if(pin==Author_PIN) {
						
						System.out.println("\n\n1.Update \n2.Exit");
						char ch=s.next().charAt(0);
						
						if(ch=='1'||ch=='2') {
						switch(ch) {
						case '1':
							UpdateFood();
							break ;
						case '2':
							break;
						}
						}
						else
							System.out.println("Enter either 1 or 2");
						
						break pinchecker;
				}
					
				}
				break;
				
				
					
			case 2:
				int p=0;
				stpinchecker:
				while(p==0) {
						System.out.println("enter the PIN");
						int stpin=s.nextInt();
						
						if(stpin==NSUer_PIN) {
							
							System.out.println("\n\n1.Order Food\n2.exit");
							char cho=s.next().charAt(0);
							if(cho=='1'||cho=='2') {
								switch(cho) {
								case '1':
									OrderFood();
									break ;
								case '2':
									break;
								}
								}
								else
									System.out.println("Enter either 1 or 2");
							
							break stpinchecker;
						}
					}
				break;
			case 3:
				break outer;
			}	
			}
			else
				System.out.println("Enter 1, 2 or 3");
				continue;
			
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Enter either 1, 2 or 3");
		}
	
	}

	public static void UpdateFood() {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("how many food itms?");
		int n=s.nextInt();
		
		Food b[]=new Food[n];
		//for(int i=0;i<n;i++) {
			//b[i]=new Food();
		//}
		
		try {
		File store = new File("food1.txt");
		FileWriter str = new FileWriter(store);
		
		for(int i=0;i<n;i++) {
			
			 s.nextLine();//to execute the extra line
			 
			System.out.println("\nEnter food's name: ");
	        String fname=s.nextLine();
	        

	        System.out.println("\nEnter the price of the food: ");
	       int price=s.nextInt();
	    

	        System.out.println("\nEnter the availability of the food item: ");
	        int availability=s.nextInt();
	       
	        b[i]=new Food(fname,price,availability);
	       
	        
	        str.write(b[i].foodname+"\n"+b[i].price+"\n"+b[i].availability);
	
		}
		
		}
		catch(IOException e) {
			System.out.println("\nfile was not created");
		}
		
	}
	
	public static void OrderFood() {
		
		Food c[]=new Food[3];
		try {
		File infile=new File("food.txt");
		Scanner sc=new Scanner(infile);
		Scanner s=new Scanner(System.in);
		
		int i=0;
        while(sc.hasNextLine()){
         	
     	   String n = sc.nextLine();
         	
     	   int p = sc.nextInt();
         	
     	   int a = sc.nextInt();
     	   
     	   c[i] = new Food(n,p,a);
     	  if(sc.hasNextLine())sc.nextLine();
         	i++;
         	
         }
        System.out.println("\n\nFood Menu");
        
        for(i=0;i<c.length;i++) {
        	System.out.println(c[i]);
        }
        
        int choose,sum=0,f=0;
        char choice;
        

        
        
		char chs;
		do
        {
            System.out.println("\n\nEnter the item number from the menu\n:");
            int chose=s.nextInt();

            for(i=0;i<c.length;i++)
            {
                if(chose-1==i)//to find the index number
                {
                    if(c[i].availability==0)
                    {
                        System.out.println("\nSorry,"+c[i].foodname+" is not available right now.");
                        System.out.println("Please choose the available items.");
                    }
                    else
                    {
                        sum=sum+c[i].price;//to count the total amount
                        c[i].availability--;
                    }

                }
                else
                {
                    f=1;
                }
            }
            /*if( f==1 )
            {
                printf("\n\nYou entered wrong input");
            }*/

            System.out.println("\n\n\nDo you want to order another item?");
            System.out.println("If yes, type Y or y");
            System.out.println("If no, type any character except y/Y :");
             chs=s.next().charAt(0);

        }while(chs=='Y' || chs=='y');

       
        System.out.println("\n\nTotal Price: "+sum);

        

        System.out.println("\n\nDo you want to confirm your order?");
        System.out.println("\nIf Yes, type y/Y");
        System.out.println("\nIF NO,type any character except y/Y \n");
        char sr=s.next().charAt(0);

    
        if(sr=='y' || sr=='Y')
        {
            token++;
            
            //System.out.println("\n\nTotal Price: "+sum);
            //System.out.println("\nYour token number is: "+token);
            //System.out.println("\n\nYour order is completed.");
            //System.out.println("\nTHANK YOU FOR CHOOSING US!");
            JOptionPane.showMessageDialog(null, "total: " + sum +"\nTOKEN: "+token+"\n\nThank you for choosing us", "ORDER is complete", JOptionPane.PLAIN_MESSAGE );
        }

        
		
		}
		catch(IOException e) {
			System.out.println("\nfile not found or null");
			
		}
		
		
	}
}
