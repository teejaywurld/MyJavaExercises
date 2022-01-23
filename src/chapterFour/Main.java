package chapterFour;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String food;
            System.out.print("Enter your firstname here: ");
            String name = scanner.nextLine();
//            System.out.print("Enter your lastname here: ");
//            String name1 = scanner.next();
            System.out.print("Enter your kitchen preference here: ");
            String kitchen = scanner.nextLine();
            System.out.print("Enter your years of experience here: ");
            int experience = scanner.nextInt();

            System.out.println("\n");

            System.out.println("Hi " + name + ", " + "your form is completed.");
            System.out.println("We will contact you if we need a chef who cooks\nSpecial Delicacies and not just " + kitchen);
            System.out.println("dishes and as well has 8 years of active cooking experience.");
            System.out.println("Your " + experience + " years experience that you have is not enough. Thank you for applying.");
        }
    }



//
//    import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String applicantName = scanner.nextLine();
//        String experience = scanner.nextLine();
//        String expertise = scanner.nextLine();
//
//        System.out.println("The form for " + applicantName + " is completed. " +
//                "We will contact you if we need a chef who cooks " + expertise +
//                " dishes and has " + experience + " years of experience.");
//    }
//}
