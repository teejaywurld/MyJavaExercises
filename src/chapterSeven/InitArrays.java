package chapterSeven;

public class InitArrays {
    public static void main(String[] args) {

        int[] nice = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200};

        System.out.printf("%s%10s%n", "Index", "Values");

        for (int counter = 0; counter < nice.length; counter++)
            System.out.printf("%3d%10d%n", counter, nice[counter]);
    }
}
