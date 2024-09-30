
package Singleton1;


public class singleton1 {

    
    public static void main(String[] args) {
        //view product info
        //retrieve data from database
            // create object database connection class
            // with the DB connection object call view/update/delete/add method 
        //view user info
        //add to cart
        //payment
        
        //DBConnection obj = new DBConnection();
        DBConnection obj = DBConnection.getInstance();
        obj.retrieveData();
        obj.saveData();
        
    }
    
}
