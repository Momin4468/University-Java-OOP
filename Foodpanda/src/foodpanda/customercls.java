
package foodpanda;
import java.util.Scanner;

public class customercls implements customer {

    protected int C_id;
    protected String C_name;
    protected String Contact;
    protected String address;
    Scanner inp = new Scanner(System.in);
    
    public int getC_id() {
        return C_id;
    }

    public void setC_id(int C_id) {
        this.C_id = C_id;
    }

    public String getC_name() {
        return C_name;
    }

    public void setC_name(String C_name) {
        this.C_name = C_name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public void inputAll() {
        C_id = inp.nextInt();
        C_name = inp.nextLine();
        Contact = inp.nextLine();
        address = inp.nextLine();
    }

    @Override
    public void printAll() {
        System.out.println("Customer ID: "+C_id);
        System.out.println("Customer name: "+C_name);
        System.out.println("Customer Contact NO: "+Contact);
        System.out.println("Customer Address: "+address);
    }
    
}
