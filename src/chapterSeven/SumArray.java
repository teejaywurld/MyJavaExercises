package chapterSeven;

public class SumArray{
    public static void main(String[] args) {

        int[] array = {1000, 500, 89, 55, 90, 125, 85, 95, 897};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];

        System.out.printf("The total of the array element is: %d%n", total);
    }
}