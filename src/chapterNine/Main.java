package chapterNine;

public class Main {
    public static void main(String[] args) {
       Vehicle vehicle1 = new Vehicle();
        System.out.println(vehicle1.getName());
        vehicle1.setName("Toyota");
        System.out.println(vehicle1.getName());
        System.out.println(vehicle1.count);

        Vehicle vehicle2 = new Vehicle("Honda Accord", "Gold", "2022", "Honda", "800");
        System.out.println(vehicle2.getColour());
        vehicle2.setColour("Green");
        System.out.println(vehicle2.getColour());
        System.out.println(vehicle2.getSpeed());
        System.out.println(vehicle2.count);
    }
}
