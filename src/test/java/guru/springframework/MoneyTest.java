package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar ten = five.times(2);
        assertEquals(new Dollar(10), ten);
        Dollar fifteen = five.times(3);
        assertEquals(new Dollar(15), fifteen);
    }

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(10));
    }
}
