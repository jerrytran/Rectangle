import java.util.Scanner;
public class Assignment2 {
  public static void main(String[] args){
    System.out.println("Enter five numbers to sum");

    int n1, n2, n3, n4, n5;

    Scanner keyboard = new Scanner(System.in);
    n1 = keyboard.nextInt();
    n2 = keyboard.nextInt();
    n3 = keyboard.nextInt();
    n4 = keyboard.nextInt();
    n5 = keyboard.nextInt();

    System.out.println("The totals are ");
    System.out.print(n1 + n2 + n3 + n4 + n5);
    }
  }
