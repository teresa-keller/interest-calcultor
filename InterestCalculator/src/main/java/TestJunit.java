import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
@Test
    public void testAdd() {
    String str = "Junit is workineg fine";
    assertEquals("Junit is working fine", str);
}
}
