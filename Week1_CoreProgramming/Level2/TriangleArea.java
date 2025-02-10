package Week1_CoreProgramming.Level2;

import java.util.Scanner;

public class TriangleArea {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaInches2 = areaCm2 / 6.45;  

        System.out.println("The area of the triangle is " + areaCm2 + " cm² and " + areaInches2 + " in².");
        input.close();
    }
}
