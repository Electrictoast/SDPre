public class Objective6Lab3{
  public static void main(String[] args){
    int counter=1;
    String result;

    while (counter<=20){
      if(counter%2==1){
        result="odd";
      }else{
        result="even";
      }
      System.out.println(counter+" is "+result);
      counter++;
    }
  }
}
