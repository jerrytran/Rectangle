import java.util.Scanner;

public class Username {
  public static void main(String[] args){
    String correctUsername = "CSC200";
    String correctPassword = "Password";
    String username ="", password ="";
    //Main method
    System.out.println("Enter your Username and Password");
    Scanner keyboard = new Scanner(System.in);

    username = keyboard.next();
    password = keyboard.next();
    
    if(username.equals(correctUsername)&& password.equals(correctPassword)){
      System.out.print("Welcome " + username);
    } else { 
      System.out.print("Wrong username and password");
     }
    }
 }

