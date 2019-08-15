import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LatvianTownRegisterTest {

    @Test
    public void testLatvianTown() {
        assertEquals(true, LatvianTownRegister.isLatvianTown("Riga"));
    }

    @Test
    public void testNonLatvianTown() {
        assertEquals(false, LatvianTownRegister.isLatvianTown("Vilnius"));
    }

    @Test
    public void testNullTown() {
        assertEquals(false, LatvianTownRegister.isLatvianTown(null));
    }
}
