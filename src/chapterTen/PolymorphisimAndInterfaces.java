package chapterTen;

// TODO:- Polymorphism is the ability of an object to take many forms.
//  Polymorphism in Java allows us perform the same action in many
//  different ways.

// TODO:- Polymorphisim in Java Example

// TODO:- A superclass named "Shapes" has a method "area()". Subclasses
//  of "Shapes" can be "Triangle", "Circle", "Rectangle", etc and each
//  subclass has a way of calculating area.

class Shapes{
        public void area(){
            System.out.print("The formula for the area of a ");
    }
}
    class Triangle extends Shapes{
        public void area(){
            System.out.println("triangle is 1/2 * base * height ");
        }
    }
    class Circle extends Shapes{
        public void area(){
            System.out.println("circle is 3.14 * radius * radius ");
        }
    }
    class Main{
        public static void main(String[] args) {
            Shapes myShape = new Shapes();
            Shapes myTriangle = new Triangle();
            Shapes myCircle = new Circle();
            myShape.area();
            myTriangle.area();
            myShape.area();
            myCircle.area();
        }
    }

// TODO:- Types of Polymorphism
//  You can perform Polymorphism in Java in two different methods:-
//  1. METHOD OVERLOADING: is the process that can create multiple
//      methods of the same name in the same class and all the methods
//      works in different ways.
//      ....................
//      EXAMPLE OF METHOD OVERLOADING IN JAVA

    class Shapes1 {
        public void area(){
            System.out.println("Find area ");
        }
        public void area(int r){
            System.out.println("Circle area = " + 3.14 * r * r);
        }
        public void area(double b, double h){
            System.out.println("Triangle area = " + 0.5 * b * h);
        }
        public void area(int l, int b){
            System.out.println("Rectangle area = " + l * b);
        }
    }
    class Main1 {
        public static void main(String[] args) {
            Shapes1 myShape = new Shapes1();
            myShape.area();
            myShape.area(5);
            myShape.area(6.0, 1.2);
            myShape.area(6, 2);
        }
    }

// TODO:-
//  2. Method Overriding: is the process when the subclass or a child class
//      has the same method as declared in the parent class.
//      ...........................
//      EXAMPLE OF METHOD OVERRIDING IN JAVA

    class Vehicle{
    //defining a method
        void run(){
            System.out.println("Vehicle is moving");
        }
    }
    //creating a child class
    class Car2 extends Vehicle{
    //defining the same method as in the parent class
        void run(){
            System.out.println("Car is running safely");
        }

        public static void main(String[] args) {
            Car2 object = new Car2(); //creating object
            object.run(); //calling method
        }
    }
