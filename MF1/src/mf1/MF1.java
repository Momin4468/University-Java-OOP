
package mf1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class MF1 {

    
    public static void main(String[] args) {
       System.out.print("Bismillahir Rahmanir Rahim\n\n");
       Scanner take = new Scanner(System.in);
       
       /*System.out.println("How many times you want to print that line: ");
       int many = take.nextInt();
       System.out.println("");
       
       for (int i = 1; i <= many; i++) {
          if(i%2 !=0)
             System.out.println("I love you N "+i);
          else 
             System.out.println("I love you too. "+i);
             
        }
        System.out.println(""); 
        
        take.nextLine();
        
        System.out.println("\n\nPlease enter your name");
        String name = take.nextLine();
        System.out.println("Please enter your age");
        int age = take.nextInt();
        
        take.nextLine();
        System.out.println("Please enter your id");
        String id = take.nextLine();
        System.out.println("Please enter your SGPA");
        float semesterGPA = take.nextFloat();
        System.out.println("Please enter your CGPA");
        double cgpa = take.nextDouble();*/
       
      /* int array[] = {3, 5, 7, 2, 9, 6, 1, 34, 56, 90};
        int total = 0;

        for (int x : array) {
            System.out.print(x + " ");
            total += x;
        }
        System.out.println("\nSummation of the array is " + total);
        */
      
      /* System.out.println("Please enter a number more than 20");
       int i = take.nextInt();
        while (i > 20) {
            System.out.println(i);
            i--;
        }*/
        
      /* int x = 10;
        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
      */
      
      
    /*  for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "\n");
            }
                 
        }
      */
    
    
     /*   int[] myArray;
        System.out.println("Array Size :");
        int myArraySize = take.nextInt();
        myArray = new int[myArraySize];
        System.out.println("Enter Values :");
        for (int i = 0; i < myArraySize; ++i) {
            myArray[i] = take.nextInt();
        }

        System.out.println("Data to Search :");
        int searchData = take.nextInt();
        searchInArray(myArray, searchData);
    }

    private static void searchInArray(int[] arr, int searchData) {
        int minimum = 0;
        int maximum = arr.length - 1;
        int mid = (minimum + maximum) / 2;
        int location = -1;
        while (minimum <= maximum) {
            if (searchData == arr[mid]) {
                location = mid + 1;
                System.out.println("\n\nThe index number of searching number is:" + mid);
                break;
            } else {
                if (searchData > arr[mid]) {
                    minimum = mid + 1;
                    mid = (minimum + maximum) / 2;

                } else {
                    maximum = mid - 1;
                    mid = (minimum + maximum) / 2;
                }
            }
        }
        if (location == -1) {
            System.out.println("\n\nData Not Found !!!!!!!!!!");
        }

    }
    */
     
     
    /*	String[] cities = {"Karachi","Delhi","Colombo","Dhaka"};
    	int i=1;
    	//Use Of Enhanced For Loop
    	for (String s:cities)
    	{
    		System.out.println("City "+i+" :"+s);
    		System.out.println("String Length :"+s.length());
    		++i;
    	}
        */
     
    //Array-List er code niche...check odd even...
    // ** To Declare an ArrayList
    
   /* ArrayList<Integer> MAL = new ArrayList<>();

        
       // ** Adding Values In An Array List 
       // ** Using Loop
        
        int data = 0;
        while (take.hasNextInt()) // Will Take Input Till You Input Integer Type Data
        {
            data = take.nextInt();
            MAL.add(data);
        }

        
        //** Check if a number of ArrayList is Even or, Odd
       // ** Using Enhaned For Loop
        
        for (int numbers : MAL) {
            if (numbers%2==0) {
                System.out.println(numbers + " is An Even Number");
            } else {
                System.out.println(numbers + " is An Odd Number");
            }
        }
     */
   
   /* ArrayList<String> myArrayList = new ArrayList<>();
       
      //  ** Adding Values In An Array List 
        
        myArrayList.add("Shunjid Rahman Showrov");
        myArrayList.add("Zubayer Alam");
        myArrayList.add("Satya Nadella");


        for (int x = 0; x < myArrayList.size(); ++x) {
            
            String Name = myArrayList.get(x);
            
            if (Name.endsWith("a") || Name.endsWith("e")|| Name.endsWith("i") || Name.endsWith("o") || Name.endsWith("u")) {
                System.out.println(myArrayList.get(x) + " :     Name Ends with a Vowel\n");
            } else {
                System.out.println(myArrayList.get(x) + " :     Name Does Not End with a Vowel\n");
            }
            
        } 
     */
   
   /* String MS[] = {"Daffodil", "International", "University"};

        // printing strArray using enhanced for loop
        for (String x : MS) {
            System.out.print(x + " ");
        }
   */
    
      /*  String array1[] = {"a", "b", "c", "d"};
        String array2[] = {"a", "b", "c", "d"};

        // method 1 (right)
        if (Arrays.equals(array1, array2)) {
            System.out.println("Both string are mathced");
        } else {
            System.out.println("String not matched");
        }

        // mehtod 2 (error)
        if (array1 == array2) {
            System.out.println("Both string are matched");
        } else {
            System.out.println("String not matched");
        }
   
       //* In Java, arrays are first class objects. In the above program, array1
       //  * and array2 are two references to two different objects. So when we
       //  * compare array1 and array2, two reference variables are compared,
       //  * therefore we get the output as “String not matched”
   
      */  
      
    /*  String str1 = "I Love";
        String str2 = "Bangladesh";

        System.out.println(str1.concat(" " + str2));
     */
    
    /*  System.out.println("Enter array limit");
        int limit = take.nextInt();

        // integer type array
        String array[] = new String[limit];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value into array index " + i);
            array[i] = take.next();
        }
        System.out.println("\n\nArray values are \n");

        for (String x : array) {
            System.out.println(x + " ");
        }
    */
    
    /*  System.out.println("Enter array limit");
        int limit = take.nextInt();
        int count = 0;
        take.nextLine(); 
        
        
        // integer type array
        String array[] = new String[limit];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the value into array position " + (++count));
            array[i] = take.nextLine();
        }

        // printing array
        System.out.println("\nPrinting array\n");
        for(int j = 0; j < array.length; j++) {
            if (array[j].endsWith("tion")) {
                System.out.println(array[j]);
            } else if (array[j].contains("ab")) {
                System.out.println(array[j]);
            } else {
                System.out.println("Condition not matched");
            }
        }
      */
    
   /* int A[] = {1,2,3,4,5};
    int B[] = {10,20,30,40,50};
    System.arraycopy(A, 0, B, 0, 2);
    
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
            
        }
   */
   
   String my = new String();
   //String my1 = "DIU SOFTF";
   String my1 = take.nextLine();
   String my2 = "diu softf";
   String my3 = "DIU SOFTF";
   
   int len = my1.length();
   
        for (int i = 0; i < len; i++) {
            char c = my1.charAt(i);
            System.out.println(c);
        }
   int a = my1.lastIndexOf("F");
        System.out.println(a);
        
    boolean f = my1.contains("I");
    System.out.println(f);
    
    String n = my1.substring(0,5);
    System.out.println(n);
    
    boolean f1 = my1.equals(my2);
    System.out.println(f1);
    
        System.out.println(my1.equalsIgnoreCase(my2));
        System.out.println(my1.compareTo(my3));
        System.out.println(my2.toUpperCase());
        System.out.println(my2.toLowerCase());
    
   
    }
    
}   

