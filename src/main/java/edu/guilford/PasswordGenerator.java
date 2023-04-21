package edu.guilford;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class PasswordGenerator 
{
   
    public static void main( String[] args )
    {
        Scanner Scan = new Scanner(System.in);

         String username = null;
         String password = null;
         //Here the user will enter som question for the password generator
         //after the user answer the questions the program will generate a password for the user based on the answers
        //get user's first name
        //let the user know this is the first user
        System.out.println("This is the first user");
        //ask the user to enter their first name, last name, email, color, animal, number, and sport
        System.out.println("Enter your first name: ");
        String firstName = Scan.nextLine();
        //get user's last name
        System.out.println("Enter your last name: ");
        String lastName = Scan.nextLine();
        //get user's email

        System.out.println("Enter your email: ");
        String email = Scan.nextLine();

        //get user's favorite color 
        System.out.println("Enter your favorite color: ");
        String color = Scan.nextLine();

        //get user's favorite animal
        System.out.println("Enter your favorite animal: ");
        String animal = Scan.nextLine();

        //get user's favorite number
        System.out.println("Enter your favorite number: ");
        String number = Scan.nextLine();

        //get user's favorite sport
        System.out.println("Enter your favorite sport: ");
        String sport = Scan.nextLine();
        
    //create a new user object
    //Here I am creating a new user object and passing the user's answers to the constructor

        User user = new User(firstName, lastName, username, email, color, animal, number, sport);
        //Generate a second user object
        //Here I am creating a second user object and passing the user's answers to the constructor
        User user2 = new User(firstName, lastName, username, email, color, animal, number, sport);

        //ask this second user to enter their first name, last name, email, color, animal, number, and sport
        //Here I am asking the user to enter the same questions again for the second user

        System.out.println("This is the second user");
        //ask the user to enter their first name, last name, email, color, animal, number, and sport
        System.out.println("Enter your first name: ");
        String firstName2 = Scan.nextLine();
        //get user's last name
        System.out.println("Enter your last name: ");
        String lastName2 = Scan.nextLine();
        //get user's email

        System.out.println("Enter your email: ");
        String email2 = Scan.nextLine();

        //get user's favorite color
        System.out.println("Enter your favorite color: ");
        String color2 = Scan.nextLine();

        //get user's favorite animal
        System.out.println("Enter your favorite animal: ");
        String animal2 = Scan.nextLine();

        //get user's favorite number
        System.out.println("Enter your favorite number: ");
        String number2 = Scan.nextLine();

        //get user's favorite sport
        System.out.println("Enter your favorite sport: ");
        String sport2 = Scan.nextLine();

        //print out the username and password for the second user
        //Here I am calling the generate username and generate password methods from the user class
        System.out.println("Your username is: " + user2.generateUsername(firstName2, lastName2));
        System.out.println("Your password is: " + user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2));

        //print out the user information for the second user
        //to finish the program I am calling the toString method from the user class to print out the user's information
        System.out.println("Your information is: ");
        System.out.println(user2.toString());



        //print out the password to the user from the genertaed password method
        //print out the username to the user from the generated username method

        //Here i am calling the generate username and generate password methods from the user class
        System.out.println("Your username is: " + user.generateUsername(firstName, lastName));
        System.out.println("Your password is: " + user.generatePassword(firstName, lastName, email, color, animal, number, sport));
       
        
        
       //print out the user informations using the toString method
       //to finish the program I am calling the toString method from the user class to print out the user's information
       System.out.println("Your information is: ");
        System.out.println(user.toString());
    
}

  
}