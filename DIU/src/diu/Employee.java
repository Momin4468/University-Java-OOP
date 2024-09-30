
package diu;

public class Employee {
    String EmployeeID;
    String Mobile_num;
    double Salary,hs,ohs;
    
    public Employee(String i,String n, double s){
        EmployeeID = i;
        Mobile_num = n;
        Salary = s;
    }
    
    public double phsalary(int h){
       hs = Salary/h;
       return hs;
    }
    
     public void overtime(int h){
        hs = Salary/h;
        double s1 = (30*hs)/100;
        ohs =  (hs+s1);
        System.out.println("Salary per hour with overtime: "+ohs);
    }    
    public void printAll(){
        System.out.println("Employee ID: "+EmployeeID);
        System.out.println("Employee mobile number: "+Mobile_num);
        System.out.println("Employee salary per week: "+Salary);
        System.out.println("Salary per hour: "+hs);
    } 
     
}
