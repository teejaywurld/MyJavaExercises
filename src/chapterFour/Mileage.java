package chapterFour;

// miles for one tankful *
// gallons for one tankful *
// initialize total miles for trip to zero *
// initialize total gallons for trip to zero *
// miles per gallon for tankful *
// miles per gallon for trip *
// prompt user for miles and obtain the input from user *
// exit if the input is -1; otherwise, proceed with the program *
// prompt user for gallons and obtain the input from user *
// add gallons and miles for this tank to total *
// calculate miles per gallon for the current tank *
// end if statement *
// calculate miles per gallon for the total trip *
// end if statement *
// prompt user for new value for miles *
// end while loop *
// end method calculateMPG *
// end class Gas *

import java.util.Scanner;

public class Mileage {
    public void calculateMPG(){
        Scanner scanner = new Scanner(System.in);

          int milesDriven;
            int gallonsUsed;
              int totalMiles = 0;
           int totalGallons = 0;
        double milesPerGallon;
          double totalMilesPerGallon;

        System.out.print("Enter miles driven here (or -1 to quit): ");
            milesDriven = scanner.nextInt();

         while (milesDriven != -1){
             System.out.print("Enter the gallons used here: ");
                 gallonsUsed = scanner.nextInt();

           totalMiles += milesDriven;
             totalGallons += gallonsUsed;

      if (gallonsUsed != 0){
          milesPerGallon = (double) milesDriven / gallonsUsed;
          System.out.printf("Total gallons used is: %.2f\n", milesPerGallon);
      }
        if (totalGallons != 0){
            totalMilesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("Total MPG is: %.2f\n", totalMilesPerGallon);
        }
             System.out.print("Enter miles driven (or -1 to quit): ");
                  milesDriven = scanner.nextInt();
         }
                      System.out.println();
    }
}
