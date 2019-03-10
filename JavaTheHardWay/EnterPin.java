import java.util.Scanner;

public class EnterPin{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    int pin,entry;

    pin=12345;

    System.out.println("Welcome to the bank of java.");
    System.out.print("enter your pin: ");
    entry=keyboard.nextInt();

    while(entry!=pin){
      System.out.println("\nIncorrect pin. try again.");
      System.out.print("enter your pin: ");
      entry=keyboard.nextInt();
    }
    System.out.println("\npin accepted. your account balance is $425.17");
  }
}
