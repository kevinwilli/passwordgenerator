package edu.guilford;

import java.util.Scanner;

public class User {
   // attributes
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private String color;
    private String animal;
    private String number;
    private String sport;



    // constructor
    public User(String firstName, String lastName, String username, String email, String color, String animal, String number, String sport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = generateUsername(firstName, lastName);
        this.email = email;
        this.color = color;
        this.animal = animal;
        this.number = number;
        this.sport = sport;
        this.password = generatePassword(firstName, lastName, email, color, animal, number, sport);
    }
    

    // getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword (String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    //getters and setters for the variable username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    } 
    

    //Create a method to generate a random single special characters
    //to make it more complicated I am going to add a random special character to the password
    //this is the method that will generate the random special character
    
    public static String generateSpecialCharacters() {
        String specialCharacters = "!@#$%^&*()_+";
        int randomIndex = (int) (Math.random() * specialCharacters.length());
        String randomSpecialCharacter = specialCharacters.substring(randomIndex, randomIndex + 1);
        return randomSpecialCharacter;
    }
    //Create a method that genrerate a password based on the user's input and the random special character
    //This is the method that will generate the password
    public static String generatePassword(String firstName, String lastName, String email, String color, String animal, String number, String sport) {
        String password = firstName.substring(0, 1) + lastName.substring(0, 1) + email.substring(0, 1) + color.substring(0, 1) + animal.substring(0, 1) + number.substring(0, 1) + sport.substring(0, 1) + generateSpecialCharacters();
        return password;
    }
    //Create a method that generate a random username based on the user's input
    //this one will generate the username
    public static String generateUsername(String firstName, String lastName) {
        String username = firstName.substring(0, 1) + lastName;
        return username;
    }

    //toString method with the password and username from the methods above
    //this is the method that will print out the password and username
    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", username=" + username + ", password=" + password + ", color=" + color + ", animal=" + animal + ", number=" + number + ", sport=" + sport + "]";
    }

    

  
    
}
