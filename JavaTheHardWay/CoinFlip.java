import java.util.Scanner;

public class CoinFlip{
  public static void main(String[] args){
    Scanner keyboard=new Scanner(System.in);
    String coin, again;
    int streak=0;
    boolean gotHeads;

    do{
      gotHeads=Math.random()< 0.5;

      if(gotHeads)
        coin="Heads";
      else
        coin="Tails";

      System.out.println("you flip a coin and its... "+coin);

      if(gotHeads){
        streak++;
        System.out.println("\tThats "+streak+" in a row...");
        System.out.println("\t would you like to flip again? (Y/N)");
        again=keyboard.next();
      }
      else{
        System.out.println("\tYou lose everyting!");
        System.out.println("\tShould have quit while you were aHEAD...");
        streak=0;
        again="N";
      }
    }while(again.equals("Y"));
    System.out.println("Final score: "+streak);
  }
}
