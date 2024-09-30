
package Singleton1;


public class Cart {
     void add(){
        //DBConnection obj = new DBConnection();
        DBConnection obj = DBConnection.getInstance();
        obj.addData();
        
    }
}
