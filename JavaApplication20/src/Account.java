/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ethan Reeds
*/
public class Account{
  private String name;
  private String password;
  public Account(String name, String pword){
      this.name = name;
      this.password = pword;
  }
  public String getName(){
      return this.name;
  }
  public String getPassword(){
      return this.password;
  }
    
}
