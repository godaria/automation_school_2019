import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivideByFiveTest {
    int numberTrue = 15;
    int numberFalse = 11;
    static DivideByFive checker;

    @BeforeAll
    public static void init() {
        checker = new DivideByFive();
        System.out.println("Checking if number divides by 5 by module");
    }

    @Test
    public void divideByFiveTrue() {
        assertEquals(true, checker.isDividedByFive(numberTrue));
    }

    @Test
    public void divideByFiveFalse() {
        assertEquals(false, checker.isDividedByFive(numberFalse));
    }

    @AfterAll
    public static void finish(){
        System.out.println("Testing complete!");
        checker = null;
    }
//
//    @AfterEach
//    public void nextTest(){
//        checker = null;
//    }
}
