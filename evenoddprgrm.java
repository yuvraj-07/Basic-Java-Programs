import java.util.Scanner;

public class evenoddprgrm {
    public static void main(String[] args) {

        // this is the code of even or odd number

        int num1, num2;

        System.out.println("enter the nummber 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("enter the nummber 1: ");
        num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("even number");

        }

        else {
            System.out.println("odd number");
        }
    }
}
