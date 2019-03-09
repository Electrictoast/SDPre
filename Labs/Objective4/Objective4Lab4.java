import java.util.Scanner;

public class Objective4Lab4{
  public static void main(String[] args){
    int userNum;
    Scanner scanner=new Scanner(System.in);

    System.out.println("Please enter a number:");
    userNum=scanner.nextInt();
    if (userNum%2==0){
      System.out.println("The number is even");
    }
    else if (userNum%2==1){
      System.out.println("The number is odd");
    }
    else{
      System.out.println("ERROR");
    }
    scanner.close();
  }
}
