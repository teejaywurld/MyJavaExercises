package chapterFour;

import java.util.Scanner;

public class SalesCommCalculator {
    public void calculateEarnings(){
        Scanner scanner = new Scanner(System.in);

        double sales;
        double gross = 0.0;
        int numberSold;
//        double percentSales = 0.09;

        System.out.println("Enter the number of item sold here: ");
        numberSold = scanner.nextInt();
        System.out.println("Enter your item sales here: ");
        sales = scanner.nextDouble();

        System.out.printf("Your total earning is: " + (200 + sales * 0.09) + numberSold, gross);
    }
}


//import java.util.Scanner;
//
//public class SalesCommCalculator {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        int i;
//
//        System.out.println("Please enter the input count of Sales People");
//        Scanner sc= new Scanner(System.in);
//        int a= sc.nextInt();
//        // for loop start
//        for(i=0;i<a;i++){
//            System.out.println("Input"+(i+1)+"-salesperson' gross sales:");
//            double sum= sc.nextDouble();
//            System.out.println("Earnings:"+(200 + sum * 0.09));
//        }
//        // for loop end
//    }
// }