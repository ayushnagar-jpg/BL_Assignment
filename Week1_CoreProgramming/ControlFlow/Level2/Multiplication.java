package Week1_CoreProgramming.ControlFlow.Level2;
import java.util.Scanner;
public class Multiplication {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        scanner.close();
    }
}

    
