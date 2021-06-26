import java.util.Scanner;
public class  GreattestNumber {
public static void main(String[] args ) {
        int  num1, num2  , num3 ;
        System.out.println("enter the first number ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter second number ");
        Scanner sc1 = new Scanner(System.in);
        num2 = sc1.nextInt();
        System.out.println("enter the third number ");
        Scanner sc2 = new Scanner(System.in);
        num3 = sc2.nextInt();
        if( num1 >= num2 && num1 >= num3 ){
           System.out.println("Number 1st is greater");
          }
        else if ( num2 >= num1 && num2 >= num3 ){
          System.out.println("Number 2nd is greater");
         }
        else {
          System.out.println("number 3rd is greater");

       }
}
}
       