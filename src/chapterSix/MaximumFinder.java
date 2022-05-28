package chapterSix;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your three floating values here: ");

        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double result = maximum(number1, number2, number3);

        System.out.println("Your Maximum Number is: " + result);
    }
    public static double maximum(double x, double y, double z){
//    double maximumValue = x;
//    if (y > maximumValue)
//        maximumValue = y;
//    if (z > maximumValue)
//        maximumValue = z;

//    return maximumValue;
        return Math.max(x, Math.max(y, z));
    }
}
