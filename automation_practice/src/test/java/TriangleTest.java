import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    int trueA = 2, trueB = 2, trueC = 1;
    int falseA = 15, falseB = 65, falseC = 1;
    static Triangle checker;

    @BeforeAll
    public static void init() {
        checker = new Triangle();
        System.out.println("Checking if sides can make up triangle");
    }

    @Test
    public void isTriangleTrue() {
        assertEquals("YES", TriangleTest.checker.isTriangle(trueA, trueB, trueC));
    }

    @Test
    public void isTriangleFalse() {
        assertEquals("NO", TriangleTest.checker.isTriangle(falseA, falseB, falseC));
    }

    @Test
    public void isNullTriangleFalse() {
        assertEquals("NO", TriangleTest.checker.isTriangle(0, falseB, falseC));
    }

    @AfterAll
    public static void finish() {
        System.out.println("Good job!");
        checker = null;
    }
}

