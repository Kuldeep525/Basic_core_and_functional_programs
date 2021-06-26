import java.util.Scanner;
public class divide {
    public static void main(String [] args){
           int dividend , divisor;
          Scanner sc = new Scanner(System.in);
          System.out.println("enter the dividend ");
          dividend = sc.nextInt();

          Scanner sc2 = new Scanner(System.in);
          System.out.println("enter the divisor ");
          divisor = sc2.nextInt();
          
          int quotient = dividend / divisor ;
          int remainder = dividend % divisor;
    
           System.out.println("your quotient ::" + quotient);
           System.out.println("your remainder ::" + remainder);
}
}
         
