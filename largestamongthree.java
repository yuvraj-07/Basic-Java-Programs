import java.util.Scanner;

public class largestamongthree {
    public static void main(String[] args) {
        
        //here i have written the code of finding the largest among three numbers

        int num1, num2, num3;

        System.out.println("enter the nummber 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("enter the nummber 2: ");
        num2 = sc.nextInt();

        System.out.println("enter the nummber 3: ");
        num3 = sc.nextInt();

        if (num1>num2 && num1>num3) {
            System.out.println("the number 1 is greater");
        }

        if (num2>num1 && num2>num3) {
            System.out.println("the number 2 is greater");
        }
        if(num3>num1 && num3>num2) {
            System.out.println("the number 3 is greater");
        }
    }
}
