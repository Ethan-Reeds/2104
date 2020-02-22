/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Ethan Reeds
 */
public class AccountManagerNGTest {
    
    public AccountManagerNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of logout method, of class AccountManager.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        AccountManager instance = new AccountManager();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class AccountManager.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        boolean expResult = false;
        boolean result = AccountManager.login(username, password);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentUser method, of class AccountManager.
     */
    @Test
    public void testGetCurrentUser() {
        System.out.println("getCurrentUser");
        AccountManager instance = new AccountManager();
        String expResult = "";
        String result = instance.getCurrentUser();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class AccountManager.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        String username = "";
        String name = "";
        String password = "";
        AccountManager.register(username, name, password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
