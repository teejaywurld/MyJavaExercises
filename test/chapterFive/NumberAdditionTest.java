package chapterFive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class NumberAdditionTest {

    @Test
    public void numberAdditionClassTest(){
        // Given that i have a number addition class
        NumberAddition addition = new NumberAddition();
        // assert not null(to check that the class truly exist)
        assertNotNull(addition);
    }
    @Test
    public void testThatNumbersCanBeAdded(){
        // Given that i have a number addition class
        NumberAddition addition = new NumberAddition();
        //wen i add 2 number
        addition.add(5, 4);
        // assert that the sum is 9
        assertEquals(9, addition.getSum());
    }
}
