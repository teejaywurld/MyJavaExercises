package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public void calculateMPG(){
        Scanner scanner = new Scanner(System.in);

        int milesDriven;
        int gallonsUsed;
        double milesPerGallon;
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;
        double totalMilesPerGallon;

        System.out.print("Enter the miles driven here(or -1 to quit): ");
        milesDriven = scanner.nextInt();

        while (milesDriven != -1){
            System.out.print("Enter the gallons used here: ");
            gallonsUsed = scanner.nextInt();

            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;

            if (gallonsUsed != 0){
                milesPerGallon = (double) milesDriven / gallonsUsed;
                System.out.printf("Total gallons used is: %.2f\n", milesPerGallon);
            }
            System.out.print("Enter the miles driven (or -1 to quit): ");
                    milesDriven = scanner.nextInt();
        }
                         System.out.println();
    }
}
