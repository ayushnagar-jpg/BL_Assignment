package Week1_CoreProgramming.ControlFlow.Level1;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
        }
        scanner.close();
    }
}

    

