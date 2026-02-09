import java.util.Scanner;

public class lcmoftwonumbers {
    public static void main(String[] args) {
        
        int num1,num2;

        System.out.println("enter the nummber 1: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("enter the nummber 2: ");
        num2 = sc.nextInt();

        int lcm = (num1 > num2) ? num1:num2;

        for (int i=0; i<lcm; i++) {
        if (lcm % num1 == 0 && lcm%num2 == 0) {
            break;
        }
        lcm++;
    }
    System.out.println("the factors are: " + lcm);
}
}
