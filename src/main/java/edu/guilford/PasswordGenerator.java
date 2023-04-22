package edu.guilford;

import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class PasswordGenerator 
{
   
    public PasswordGenerator(String firstName, String lastName, String email, String color, String animal,
            String number, String sport) {
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        //String username = null;
         //String password = null;
         //Here the user will enter som question for the password generator
         //after the user answer the questions the program will generate a password for the user based on the answers
        //get user's first name
        //let the user know this is the first user
        System.out.println("This is the first user"+"\n");
        //ask the user to enter their first name, last name, email, color, animal, number, and sport
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        //get user's last name
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();
        //get user's email

        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        //get user's favorite color 
        System.out.println("Enter your favorite color: ");
        String color = scan.nextLine();

        //get user's favorite animal
        System.out.println("Enter your favorite animal: ");
        String animal = scan.nextLine();

        //get user's favorite number
        System.out.println("Enter your favorite number: ");
        String number = scan.nextLine();

        //get user's favorite sport
        System.out.println("Enter your favorite sport: ");
        String sport = scan.nextLine();
        
    //create a new user object
    //Here I am creating a new user object and passing the user's answers to the constructor

        User user = new User(firstName, lastName, email, color, animal, number, sport);
       
       //print out the password to the user from the genertaed password method
        //print out the username to the user from the generated username method

        //Here i am calling the generate password methods from the user class
        
        System.out.println("Your password is: " + user.generatePassword(firstName, lastName, email, color, animal, number, sport));
        
        //print the encrypted password to the user

        System.out.println("Your encrypted password is: " + AES.encryptPassword(user.generatePassword(firstName, lastName, email, color, animal, number, sport)));

        //print the decrypted password to the user
    
        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user.generatePassword(firstName, lastName, email, color, animal, number, sport)))+"\n");
       
        //Generate a second user object
        //Here I am creating a second user object and passing the user's answers to the constructor
        User user2 = new User(firstName, lastName, email, color, animal, number, sport);

        //ask this second user to enter their first name, last name, email, color, animal, number, and sport
        //Here I am asking the user to enter the same questions again for the second user

        System.out.println("This is the second user"+"\n");
       
        //ask the user to enter their first name, last name, email, color, animal, number, and sport

        System.out.println("Enter your first name: ");
        String firstName2 = scan.nextLine();
        //get user's last name

        System.out.println("Enter your last name: ");
        String lastName2 = scan.nextLine();
        //get user's email

        System.out.println("Enter your email: ");
        String email2 = scan.nextLine();

        //get user's favorite color

        System.out.println("Enter your favorite color: ");
        String color2 = scan.nextLine();

        //get user's favorite animal

        System.out.println("Enter your favorite animal: ");
        String animal2 = scan.nextLine();

        //get user's favorite number

        System.out.println("Enter your favorite number: ");
        String number2 = scan.nextLine();

        //get user's favorite sport

        System.out.println("Enter your favorite sport: ");
        String sport2 = scan.nextLine();

        //print out the username and password for the second user
        //Here I am calling the generate password methods from the user class
       
        System.out.println("Your password is: " + user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2));

         //print the encrypted password to the second user
         //Here I'm calling the encrypted password method from AES class which used the password generated from the user class

        System.out.println("Your encrypted password is: " + AES.encryptPassword(user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2)));

        
        //print out the decryped password for the second user
        //Here I am calling the decrypt password method from the AES class which used the password generated from the user class

        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2)) ));
      
    
}
        //I use the quick fix to get this (don't rally know why and where to put it)

        //Create a getPassword method that will return the password of the user 
    public String getPassword() {
    return null;
}
    public static String getPassword(User user) {
    return user.getPassword();
}


}
