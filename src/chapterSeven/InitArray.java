package chapterSeven;

//public class InitArray {
//    public static void main(String[] args) {
//
//        int[] array = new int[10];
//
//        System.out.printf("%s%10s%n", "Index", "Value");
//
//        for (int counter = 0; counter < array.length; counter++)
//        System.out.printf("%3d%10d%n", counter, array[counter]);
//    }
//}


public class InitArray {
    public static void main(String[] args) {

        final int ARRAY_LENGTH = 20;
        int[] array = new int[ARRAY_LENGTH];

        for (int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;

        System.out.printf("%s%10s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%3d%10d%n", counter, array[counter]);
    }
}
