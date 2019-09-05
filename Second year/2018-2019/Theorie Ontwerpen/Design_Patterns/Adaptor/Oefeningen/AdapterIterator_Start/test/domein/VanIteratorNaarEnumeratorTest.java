package domein;

import org.junit.Test;
import org.junit.Assert;

public class VanIteratorNaarEnumeratorTest {

    @Test
    public void testIteratorNaarEnumeration() {
        Class1 class1 = new Class1();
        String items = class1.toString();
        Assert.assertEquals("item1 item2 item3 item4 ", items);
    }
}
