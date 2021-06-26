import java.util.Scanner;
public class Swap {
    public static void main(String [] args){
           int x , y , temp ;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the  first number ");
          x = sc.nextInt();

          Scanner sc2 = new Scanner(System.in);
          System.out.println("enter the second number ");
          y = sc2.nextInt();

          temp = x;
          x = y ;
          y = temp ;
          System.out.println("x is " + x  );
         System.out.println("y is " + y  );
}
}