import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABCDtest {
    ABCD check = new ABCD();

    @Test
    public void checkNonMatchBeforeAB() {
        assertEquals(0, check.countMatchInRanges(0, 3, -7, 0));
    }

    @Test
    public void checkNonMatchAfterAB() {
        assertEquals(0, check.countMatchInRanges(0, 3, 3, 18));
    }

    @Test
    public void checkMatchEqualRanges() {
        assertEquals(3, check.countMatchInRanges(0, 4, 0, 4));
    }

    @Test
    public void checkMatchInsideAB() {
        assertEquals(1, check.countMatchInRanges(0, 3, 1, 3));
    }
}



