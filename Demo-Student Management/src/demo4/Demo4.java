
package demo4;


public class Demo4 {

   
    public static void main(String[] args) { //CLIENT
       /*localstudent obj_l = new localstudent(); //  Will not do this
       obj_l.cgpa = 3.9;
       
       Moderator obj_m = new Moderator();
       obj_m.giveswaiver(obj_l);*/
       
       student momin = StudentFactory.getStudent("Local Student");
       momin.getclearance();
       momin.viewpayment();
       
       student zihad = StudentFactory.getStudent("Foreign Student");
       zihad.getclearance();
       zihad.viewpayment();
       
       
    }
    
}
