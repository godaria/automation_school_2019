import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    static Triangle checker;

    @BeforeAll
    public static void init() {
        checker = new Triangle();
        System.out.println("Checking if sides can make up triangle");
    }

    @Test
    public void isTriangleTrue() {
        assertEquals("YES", TriangleTest.checker.isTriangle(2,2,1));
    }

    @Test
    public void isTriangleFalse1() {
        assertEquals("NO", TriangleTest.checker.isTriangle(1,2,1));
    }

    @Test
    public void isTriangleFalse2() {
        assertEquals("NO", TriangleTest.checker.isTriangle(2,1,1));
    }

    @Test
    public void isTriangleFalse3() {
        assertEquals("NO", TriangleTest.checker.isTriangle(1,1,2));
    }

    @Test
    public void isNullTriangleFalse() {
        assertEquals("NO", TriangleTest.checker.isTriangle(0, 80,6));
    }
    @AfterAll
    public static void finish() {
        System.out.println("Good job!");
        checker = null;
    }
}

