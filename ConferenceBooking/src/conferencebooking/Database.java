/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conferencebooking;
import com.firebase.client.Firebase;
/**
 *
 * @author aabdin02
 */
public class Database {
    String roomNumberURL = "https://conferencebooking-a450a.firebaseio.com/";
    Firebase roomNumber = new Firebase(roomNumberURL);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
