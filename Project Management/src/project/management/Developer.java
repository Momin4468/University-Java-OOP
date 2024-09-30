package project.management;

import java.util.Scanner;

public class Developer {
    Scanner input = new Scanner(System.in);
    protected int devid;
    protected String devname;
    protected double devsalary;
    protected int devphn;

public void input_devid(){
    System.out.println("Enter Developer Id:");
    devid= input.nextInt();
}
public int set_devid(){
    return devid;
}
public void get_devid(){
    System.out.println("Developer Id ="+devid);
}
public void input_devname(){
    System.out.println("Enter Developer Name:");
    devname= input.nextLine();
}
public String set_devname(){
    return devname;
}
public void get_devname(){
    System.out.println("Developer Name ="+devname);
}
public void input_devsalary(){
    System.out.println("Enter Developer Salary:");
    devsalary= input.nextDouble();
}
public double set_devsalary(){
    return devsalary;
}
public void get_devsalary(){
    System.out.println("Developer Salary ="+devsalary);
}
public void input_devphn(){
    System.out.println("Enter Developer Phone Number:");
    devphn= input.nextInt();
}
public int set_devphn(){
    return devphn;
}
public void get_devphn(){
    System.out.println("Developer Phone Number ="+devphn);
}
public void input_all(){
    System.out.println("Enter Developer Id:");
    devid=input.nextInt();
    System.out.println("Enter Developer Name:");
    devname=input.nextLine();
    System.out.println("Enter Developer Salary:");
    devsalary=input.nextDouble();
    System.out.println("Enter Developer Phone Number:");
    devphn=input.nextInt();
    }
public void get_all(){
    System.out.println("Developer Id:"+devid);
    System.out.println("Developer Name:"+devname);
    System.out.println("Developer Salary:"+devsalary);
    System.out.println("Developer Phone Number:"+devphn);
    }
}
