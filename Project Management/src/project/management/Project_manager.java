package project.management;

import java.util.Scanner;

public class Project_manager{
    Scanner input = new Scanner(System.in);
    protected int mangid;
    protected String mangname;
    protected double mangsalary;
    protected int mangphn;
    protected int proid;
    
public void input_mangvid(){
    System.out.println("Enter Manager Id:");
    mangid= input.nextInt();
}
public int set_mangid(){
    return mangid;
}
public void get_mangid(){
    System.out.println("Manager Id ="+mangid);
}
public void input_mangname(){
    System.out.println("Enter Manager Name:");
    mangname = input.nextLine();
}
public String set_mangname(){
    return mangname;
}
public void get_mangname(){
    System.out.println("Manager Name ="+mangname);
}
public void input_mangsalary(){
    System.out.println("Enter Manager Salary:");
    mangsalary= input.nextDouble();
}
public double set_mangsalary(){
    return mangsalary;
}
public void get_mangsalary(){
    System.out.println("Manager Salary ="+mangsalary);
}
public void input_mangphn(){
    System.out.println("Enter Manager Phone Number:");
    mangphn= input.nextInt();
}
public int set_mangphn(){
    return mangphn;
}
public void get_mangphn(){
    System.out.println("Manager Phone Number ="+mangphn);
}
public void assignproid(int Id){
      proid=Id;
    }
public void input_all(){
    System.out.println("Enter Manager Id:");
    mangid=input.nextInt();
    System.out.println("Enter Manager Name:");
    mangname=input.nextLine();
    System.out.println("Enter Manager Salary:");
    mangsalary=input.nextDouble();
    System.out.println("Enter Manager Phone Number:");
    mangphn=input.nextInt();
    }
public void get_all(){
    System.out.println("Manager Id:"+mangid);
    System.out.println("Manager Name:"+mangname);
    System.out.println("Manager Salary:"+mangsalary);
    System.out.println("Manager Phone Number:"+mangphn);
    }
}
