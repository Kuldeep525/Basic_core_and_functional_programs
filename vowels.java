import java.util.Scanner;
public class vowels {
 public static void main(String[] args){
    
      char ch ;
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the alphabet");
      ch = sc.next().charAt(0);
      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
         System.out.println("this alphabet is vowel::" +ch );
     }
      else {
         System.out.println( " is consonant" );    
   }
}
 }  