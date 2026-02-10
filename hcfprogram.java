import java.util.Scanner;
import java.util.*;

//here i have written the program to find the HCF of two numbers 
public class hcfprogram {
    public static void main(String[] args) {
        
        int num1, num2;

        System.out.println("enter the nummber 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("enter the nummber 2: ");
        num2 = sc.nextInt();

        int temp = 0;

        for (int i=1; i<=num1; i++) {
            if(num1%i==0 && num2%i==0) {
                temp = i;
            }
        }

        System.out.println("the hcf of two number is : " + temp);
    }
}
