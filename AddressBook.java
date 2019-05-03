/**
 * @(#)AddressBook.java
 * @authors Matthew Bice and Mohammed Zayed
 * @version 1.00 2019/04/25 3:18 PM
 *
 * PROGRAM PURPOSE: To begin the program and allow the user to create an address book and
 * display its contents.
 */

import java.util.Scanner;

public class AddressBook
{
    private Scanner input = new Scanner(System.in);//Allows input data to be captured by the Scanner.
    private int bookSize = 0;//Integer that decides how many entries the address book will have.
    private Addressee[] addressBook;
    private int relationship = 0;
    /**
     * Empty constructor for initialization.
     */
    public AddressBook()
    {
        
    }
    
    /**
     * This method will begin the main program
     */
    public void start()
    {
        char begin = ' ';
        
        //Response to the "begin entering addresses" prompt and dictates if
        //the program will execute. If the response is not 'Y', the system will exit.
        
        System.out.printf("%nBegin entering addresses? 'Y' or 'N':  ");
        begin = input.nextLine().charAt(0);
        
        if(begin == 'y')
        {
            createAddressBook();
            displayAddressBook();
        }//END if begin == 'y'
        
        else
        {
            System.out.printf("%nExiting program.");
            System.exit(0);
        }
    }//END start()
    
    /**
     * This method will create the entries in the address book.
     */
    public void createAddressBook()
    {
        
        
        System.out.printf("%nEnter your name:  ");
        String name = input.nextLine();
        
        System.out.printf("%nHow many contacts will be recorded in your address book?");
        int bookSize = input.nextInt();
        input.nextLine();
        
        addressBook = new Addressee[bookSize];
        
        for(int i = 0; i < addressBook.length; i++)
        {
            addressBook[i] = new Addressee();
            addressBook[i].setAddressee();
            String addressee = addressBook[i].getAddressee();
            addressBook[i].setStreet(addressee);
            addressBook[i].setCityStateZip(addressee);  
            addressBook[i].setPhone(addressee);
            addressBook[i].setRelationship(); 
            
        }//END enhanced for loop
        
        
        //END for i < addressBook.length
        
        
        
    }//END createAddressBook()
    
    public void displayAddressBook()
    {
        
        String family = String.format("%nFAMILY%n");
        String friends = String.format("%nFRIENDS%n");
        String work = String.format("%nWORK%n");
        
        boolean hasFamily = false;
        boolean hasFriends = false;
        boolean hasWork = false;
        
        for(int j = 0; j < addressBook.length; j++)
        {
            switch(addressBook[j].getRelationship())
            {
                case 1:
                    hasFamily = true;   
                    family += String.format("%nAddressee:  %s" + "%nStreet:  %s" 
                                                + "%nCity, State Zip:  %s" 
                                                + "%nPhone:  %s%n", addressBook[j].getAddressee(),
                                            addressBook[j].getStreet(), addressBook[j].getCityStateZip(),
                                            addressBook[j].getPhone());
                    
                    break;
                case 2:
                    hasFriends = true;
                    
                    
                    friends += String.format("%nAddressee:  %s" + "%nStreet:  %s" 
                                                 + "%nCity, State Zip:  %s" 
                                                 + "%nPhone:  %s%n", addressBook[j].getAddressee(),
                                             addressBook[j].getStreet(), addressBook[j].getCityStateZip(),
                                             addressBook[j].getPhone());
                    
                    
                    
                    //END if(hasfriends)
                    break;
                case 3:
                    hasWork = true;
                    
                    work+= String.format("%nAddressee:  %s" + "%nStreet:  %s" 
                                             + "%nCity, State Zip:  %s" 
                                             + "%nPhone:  %s%n", addressBook[j].getAddressee(),
                                         addressBook[j].getStreet(), addressBook[j].getCityStateZip(),
                                         addressBook[j].getPhone());
                    
                    
                    
            }//END if(hasWork)
            
            
            
        }
        if(hasFamily)
        {
            System.out.printf(family);
        }//END if(hasFamily)
        if(hasFriends)
        {
            System.out.printf(friends);
        }
        if(hasWork)
        {
            System.out.printf(work);
        }
        
    }  
}
//END APPLICATION CLASS AddressBook
