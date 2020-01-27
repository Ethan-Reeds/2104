/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan Reeds
 */
import java.util.*;
public class AccountManager {
    private static Map<String, Account> users = new HashMap<String, Account>(); 
    private boolean loggedIn;
    private static String currentUser = "";
    
    public AccountManager() {
        //users = new HashMap<String, Account>(); 
        //this.loggedIn = false; 
        //currentUser = ""; asda 1312
    }
    
    public void logout() {
        this.loggedIn = false; 
    }
    public static boolean login(String username, String password) {
        //this.loggedIn = true;
        if (users.isEmpty()) {
            return false; 
        } 
        if (users.get(username).getPassword().equals(password)) {
            currentUser = username;
            return true;
        }
        return false;
        
    }
    public String getCurrentUser() {
        return this.currentUser + " has logged in";
    }
    public static void register(String username, String name, String password) {
        users.put(username, new Account(name, password)); 
    }
}
