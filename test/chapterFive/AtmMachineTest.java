package chapterFive;

import junit.framework.TestCase;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AtmMachineTest {
    @Test
    public void accountCanBeCreatedTest(){
        String userName = "Adetunji Henry";
        String phoneNumber = "07032199678";

        AtmMachine app = new AtmMachine("Adetunji Henry", "07032199678");
        assertEquals(app.getuserName(), userName);
        assertEquals(app.getphoneNumber(), phoneNumber);
    }
    @Test
    public void depositCanBeMade(){
        AtmMachine app = new AtmMachine("Oluwadamilare Hassan", "08033771263");
        app.deposit(20000);
        assertEquals(20000, app.getBalance());
    }
    @Test
    public void withdrawalCanBeMade(){
        AtmMachine app = new AtmMachine("Ibidapo Olamilekan", "09023456789");
        app.deposit(45000);
        assertEquals(45000, app.getBalance());
        app.withdraw(30000);
    }
    @Test
    public void negativeAmountCannotBeDeposited(){
        AtmMachine app = new AtmMachine("Ibidapo Olamilekan", "09023456789");
        app.deposit(-15000);
        assertEquals(0, app.getBalance());
    }
    @Test
    public void withdrawalAmountCannotBeNegative(){
        AtmMachine app = new AtmMachine("Ibidapo Olamilekan", "09023456789");
        app.deposit(30000);
        assertEquals(30000, app.getBalance());
        app.withdraw(-31000);
        assertEquals(30000, app.getBalance());
    }
    @Test
    public void withdrawalAmountCannotBeZero(){
        AtmMachine app = new AtmMachine("Ibidapo Olamilekan", "09023456789");
        app.deposit(15000);
        assertEquals(15000, app.getBalance());
        app.withdraw(0);
        assertEquals(15000, app.getBalance());
    }
}
