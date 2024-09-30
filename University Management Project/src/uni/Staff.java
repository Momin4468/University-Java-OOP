
package uni;


public class Staff extends Person{
    
    int emp_ID;
    double m_salary;
    double y_salary;
    
     void stfInfo(){
       System.out.println("Employee ID:");
       emp_ID = input.nextInt();
       System.out.println("Monthly Salary:");
       m_salary = input.nextDouble();
   }
    
     void sal_calc(){
       y_salary = m_salary*12;
       y_salary = y_salary + (y_salary*5/100);
   }
     
      void printstf(){
       System.out.println("Staff Information: ");
       printInfo();
       System.out.println("Employee ID: "+emp_ID);
       System.out.println("Yearly Salary: "+y_salary);
      
   }
}
