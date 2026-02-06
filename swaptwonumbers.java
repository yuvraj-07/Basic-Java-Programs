import java.util.Scanner;

public class swaptwonumbers {
    
    public static void main(String[] args) {
        
        int num1, num2, temp;

        System.out.println("enter the number 1: ");
        Scanner sp = new Scanner(System.in);
        num1 = sp.nextInt();

        System.out.println("enter the number 2: ");
        num2 = sp.nextInt();

        System.out.println("afetr swapping the element is: " + num1 + "," + num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("afetr swapping the element is: " + num1 + "," + num2);
    }
}
