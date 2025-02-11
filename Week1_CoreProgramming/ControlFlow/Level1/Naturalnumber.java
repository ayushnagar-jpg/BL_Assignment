package Week1_CoreProgramming.ControlFlow.Level1;

import java.util.Scanner;

public class Naturalnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (n >= 1) {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
        scanner.close();
    }
    
}
