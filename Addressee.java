/**
 * @(#)Addressee.java
 * author Matthew Bice
 * version 1.00 2019/04/16 11:57 PM
 * 
 * PROGRAM PURPOSE: To code a program that prompts and stores the information for an arbitrary
 * number of addresees.
 * 
 */

import java.util.Scanner;

public class Addressee
{
  private Scanner input = new Scanner(System.in);//Allows input data to be captured by the Scanner.
  private String addressee = " ";//The name of the addressee.
  private String street = " ";//The name of the addresee's street.
  private String cityStateZip = " ";//The addressee's city, state, and zip code.
  private String phone = " ";//The addresee's phone number (unformatted).
  private StringBuilder phoneFormatted = null;//The phone number of the addressee formatted with dashes.
  private int relationship = 0;
  //The addressee's relationship with the user.
  // 1 for family, 2 for friend, or 3 for work.

/**
 * Empty constructor for initialization.
 */
public Addressee()
{

}
  
  /**
   * The main method of the program. In this case, it is empty.
   */
  
  /**
   * This method prompts the user for the name of the addressee. The user will then input the name and it
   * will be stored in the "addressee" field.
   */
  public void setAddressee()
  {
    System.out.printf("%nEnter the name of the addressee:  ");
    this.addressee = input.nextLine();
  }//END setAddresee()
  
  /**
   * This method returns the addressee field.
   */
  public String getAddressee()
  {
    return this.addressee;
  }//END getAddressee()
  
  
  
  /**
   * After receiving the addressee String variable, the user is then prompted to enter the 
   * street name for the addressee. The input street name is then stored in the "street" field.
   */
  public void setStreet(String addressee)
  {
    System.out.printf("%nEnter the street for %s:  ", addressee);
    street = input.nextLine();
  }//END setStreet()
  
  /**
   * This method returns the street field.
   */
  public String getStreet()
  {
    return this.street; 
  }//END getStreet()
  
  
  
  /**
   * This method will receive the String variable for the addresee's name and use it to prompt the user
   * for the addresee's city, state, and zip code in that order. This information will then be stored
   * in the "cityStateZip" field.
   */
  public void setCityStateZip(String addressee)
  {
    System.out.printf("%nEnter the city, state and zip code for %s in the correct format:  ", addressee);
    cityStateZip = input.nextLine();
  }//END setCityStateZip()
  
  /**
   * This method returns the cityStateZip field.
   */
  public String getCityStateZip()
  {
    return this.cityStateZip; 
  }//END getCityStateZip()
  
  
  
  /**
   * In this method, the name of the addressee is received and used to prompt the user to enter the addresee's
   * 10 digit phone number. Note that this input is not formatted in any way. The input will then be stored
   * in the "phone" field.
   */
  public void setPhone(String addressee)
  {
    System.out.printf("%nEnter the 10 digit phone number for %s without dashes or parentheses:  ", addressee);
   
    phone = input.nextLine();
    phoneFormatted = new StringBuilder(phone);//Allows the input phone number to be formatted.
    phoneFormatted.insert(3, '-');//Adds a dash after the third digit.
    phoneFormatted.insert(7, '-');//Adds a dash after the sixth digit.
  }//END setPhone()
  
  /**
   * This method receives the value in the phone field, formats it with dashes, and returns it
   * in the new phoneFormatted field.
   */
  public StringBuilder getPhone()
  {
    
    return this.phoneFormatted; 
  }//END getPhone()
  
  
  
  /**
   * This method receives nothing and prompts the user to input a number (stored as a String) 
   * that represents the user's relationship with the addresee. In this case,
   * 1 represents family, 2 represents friends, and 3 represents work. This String 
   * will be stored in the "relationship" field.
   */
  public void setRelationship()
  {
    System.out.printf("%nRelationship of the addressee:  %n %n1.  Family %n2.  Friends %n3.  Work"
                     +"%n%nChoose from the above:  ");
    relationship = input.nextInt();
    input.nextLine();
  }//END setRelationship()
  
  /**
   * This method returns the relationship field.
   */
  public int getRelationship()
  {
    return this.relationship;
  }//END getRelationship()
  
}//END APPLICATION CLASS Addressee