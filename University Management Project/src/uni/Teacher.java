
package uni;


public class Teacher extends Person{
    int emp_ID;
    double m_salary;
    double y_salary;
    int cdt;
    
   void tcInfo(){
       System.out.println("Employee ID:");
       emp_ID = input.nextInt();
       System.out.println("Monthly Salary:");
       m_salary = input.nextDouble();
       System.out.println("Total Credit hour:");
       cdt = input.nextInt();
   }
   
   void sal_calc(){
       y_salary = m_salary*12;
       y_salary = y_salary + (y_salary*10/100);
   }
   
   void printTc(){
       System.out.println("Teacher Information: ");
       printInfo();
       System.out.println("Employee ID: "+emp_ID);
       System.out.println("Yearly Salary: "+y_salary);
       System.out.println("Total Credit hours taken: "+cdt);
   }
}
