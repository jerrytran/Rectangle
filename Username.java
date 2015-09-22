import java.util.Scanner;
public class Username {
  public static void main(String[] args){
    String correctUsername = "CSC200";
    String correctPassword = "Password";
    String username ="", password ="";
    //Main method
    System.out.println("Enter your Usernam and Password");
    Scanner keyboard = new Scanner(System.in);

    username = keyboard.next();
    password = keyboard.next();
    
    if(username.equals(correctUsername)&& password.equals(correctPassword)){
     system.out.print("Welcome " + Username);
    } else { 
     system.out.print("Wrong username and password");
     }
    }
 }

