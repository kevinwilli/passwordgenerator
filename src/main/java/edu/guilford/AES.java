package edu.guilford;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class AES {
private static SecretKeySpec secretKey;
private static byte[] key;
public static void setKey(String myKey) {
MessageDigest sha = null;
try {
key = myKey.getBytes("UTF-8");
sha = MessageDigest.getInstance("SHA-1");
key = sha.digest(key);
key = Arrays.copyOf(key, 16);
secretKey = new SecretKeySpec(key, "AES");
} catch (NoSuchAlgorithmException e) {
e.printStackTrace();
} catch (UnsupportedEncodingException e) {
e.printStackTrace();
}
}
// Encrypts the string using AES
// The string to encrypt and the secret key are passed as parameters
// The encrypted string is returned as null if an error occurs
public static String encrypt(String strToEncrypt, String secret) {
try {
setKey(secret);
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE, secretKey);
return
Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
} catch (Exception e) {
System.out.println("Error while encrypting: " + e.toString());
}
return null;
}
public static String decrypt(String strToDecrypt, String secret) {
try {
setKey(secret);
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
cipher.init(Cipher.DECRYPT_MODE, secretKey);
return new
String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
} catch (Exception e) {
System.out.println("Error while decrypting: " + e.toString());
}
return null;
}


/*//create a method to encrypt the password from user.generatepassword(firstName, lastName, email, color, animal, number, sport) method
public static String encryptPassword(String firstName, String lastName, String email, String color, String animal, String number, String sport) {
PasswordGenerator password = new PasswordGenerator(firstName, lastName, email, color, animal, number, sport);
String encryptedPassword = AES.encrypt(password.getPassword(), "password");
return encryptedPassword;
}*/

//create a method to decrypt the password from user.generatepassword(firstName, lastName, email, color, animal, number, sport) method
public static String decryptPassword(String firstName, String lastName, String email, String color, String animal, String number, String sport) {
PasswordGenerator password = new PasswordGenerator(firstName, lastName, email, color, animal, number, sport);
String decryptedPassword = AES.decrypt(password.getPassword(), "password");
return decryptedPassword;
}


public static String encryptPassword (String password) {
String encryptedPassword = AES.encrypt(password, "password");
return encryptedPassword;
}
//use the method above and correct the syntax


public static String decryptPassword(String password) {
String decryptedPassword = AES.decrypt(password, "password");
return decryptedPassword;
}

}
