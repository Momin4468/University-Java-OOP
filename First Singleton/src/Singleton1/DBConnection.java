
package Singleton1;


public class DBConnection { //used to connect with DB
    
    //Singleton Code
    private static DBConnection obj = new DBConnection();
    /*
    1. Variable is private jeno onno kono class ai variable use krte na pare.
    2. Variable is static karon aita ekbr created hoise & shared variable/object for all who will use it.
    3. Public rakhle ai obj variable call kore onno class theke obj banaite parbo.
    4. Ejnno industry te method use kore object create kori.
    5. So variable guli private rekhe, getter-setter etc. method use krtm vivinno kaaje, eshb public thakto.
    */
    
    private DBConnection(){
        
    }
    /*
    1. Constructor private jeno onno kono class ai class er object create krte na pare. 
    */
    
    public static DBConnection getInstance(){
        return obj;
    }
    /*
    1. ai method DBConnection class er object return kore.
    2. method type DBConnection cz ai cls er obj rtrn korbe.
    
    */
    //Singleton Code
    
    
    /* Previous One
    DBConnection(){
        System.out.println("Connection with DB");
    }*/
    
    void saveData(){
        System.out.println("Saving Data");
    }
    
    void retrieveData(){
        System.out.println("Getting Data");
    }
    
    void addData(){
        System.out.println("Adding Data");
    }
}
