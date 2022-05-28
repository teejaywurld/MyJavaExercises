package deitelExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
    @BeforeEach
    public void testThatAdditionCanBeAdded(){
    }

    @Test
    public void testThatNumberCaBeAdded(){
        Arithmetic addition = new Arithmetic();
        Assertions.assertEquals(10, addition.add(4, 6));
    }

    @Test
    public void testThatNumberCanBeSubtracted(){
        Arithmetic difference = new Arithmetic();
        Assertions.assertEquals(10, difference.minus(15, 5));
    }

    @Test
    public void testThatNumberCanBeMultiplied(){
        Arithmetic multiplication = new Arithmetic();
        Assertions.assertEquals(6, multiplication.multiply(3, 2));
    }

    @Test
    public void testThatNumberCanBeDivided(){
        Arithmetic division = new Arithmetic();
        Assertions.assertEquals(2, division.quotient(6, 3));
    }

    @AfterEach
    public void whenTestPass(){
        System.out.println("Programmer!!!");
    }
}












//    @BeforeEach
//    public void testCanBeAdded(){
//
//    }
//
//    @Test
//    public void testThatNumberCanBeAdded(){
//        Addition addition = new Addition();
//        Assertions.assertEquals(10, addition.add(7, 3));
//    }
//
//    @AfterEach
//    public  void whenTestPass(){
//        System.out.println("Hurray!");
//    }
