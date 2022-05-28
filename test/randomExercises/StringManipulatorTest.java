package randomExercises;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringManipulatorTest {
    @Test
    public void testThatStringCanBeChecked() {
        StringManipulator stringManipulator = new StringManipulator();
        String reference = "Abraham";
        Assertions.assertEquals("Abraham", stringManipulator.stringValue(reference));
    }

    @Test
    public void testThatNumbersCanBeChecked() {
        StringManipulator stringManipulator = new StringManipulator();
        String opposition = "12345";
        Assertions.assertEquals(opposition, stringManipulator.stringValue(opposition));
    }
}



















//    @Test
//    public  void testThatStringIsSame(){
//        StringManipulator stringManipulator= new StringManipulator();
//        String reference= "A";
//        Assertions.assertEquals("A", stringManipulator.stringValue(reference));
//    }
