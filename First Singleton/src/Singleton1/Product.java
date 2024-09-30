/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton1;

/**
 *
 * @author DCL
 */
public class Product {
     void view(){
       // DBConnection obj = new DBConnection();
       DBConnection obj = DBConnection.getInstance();
       /*
       1. get instance method diye amra DBConnection class er object create korchi, ja return hocceh oi class theke.
       2. r obj er rtrn type hbe DBConnection
       */
       obj.retrieveData();
    }
}
