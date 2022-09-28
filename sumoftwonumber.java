import java.util.Scanner;

public class sumoftwonumber {


        public static void main(String[] args) {

            int a , b;
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number:");

            a = sc.nextInt();

            System.out.print("Enter second number:");
            b = sc.nextInt();
            int sum = sum(a, b);


            System.out.println("sum of numbers a and b is:"+sum);


        }
        public static int sum(int k,int l){
            int sum = k+l ;
            return sum;
        }
    }
