
package uni;



public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Welcome to DAFFODIL INTERNATIONAL UNIVERSITY");
        System.out.println("");
        
        Teacher tc = new Teacher();
        Student sd = new Student();
        Staff sf = new Staff();
        Course cs = new Course();
        
        System.out.println("Enter Teacher's Information");
        tc.takeIn();
        tc.tcInfo();
        tc.sal_calc();
        System.out.println("");
        
        System.out.println("Enter Student's Information");
        sd.takeIn();
        sd.stdInfo();
        System.out.println("");
        
        System.out.println("Enter Staff's Information");
        sf.takeIn();
        sf.stfInfo();
        sf.sal_calc();
        System.out.println("");
        
        System.out.println("Enter Course's Information");
        cs.crsInfo();
        cs.enrol();
        
        cs.assign();
        System.out.println("");
        
        
        System.out.println("");
        tc.printTc();
        
        System.out.println("");
        sd.printStd();
        
        System.out.println("");
        sf.printstf();
        
        System.out.println("");
        cs.printCourse();
    }
}
