import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OptionalSampleTest {
    OptionalSample optionalSample = new OptionalSample();

    @Test
    void optionalOfNull() {
        assertThrows(NullPointerException.class, ()->optionalSample.optionalOfNull());
    }

    @Test
    void isOptionalAbsentNull() {
        assertFalse(optionalSample.isOptionalAbsentNull());
    }

    @Test
    void isOptionalAbsentPresent() {
        assertFalse(optionalSample.isOptionalAbsentPresent());
    }

    @Test
    void isFromNullableNull() {
        assertFalse(optionalSample.isFromNullableNull());
    }

    @Test
    void isFromNullableNullPresent() {
        assertFalse(optionalSample.isFromNullableNullPresent());
    }

    @Test
    void isFromNullableStringPresent() {
        assertTrue(optionalSample.isFromNullableStringPresent());
    }

    @Test
    void getString() {
        assertEquals("foo", optionalSample.getString());
    }

    @Test
    void getEmptyString() {
        assertEquals("", optionalSample.getEmptyString());
    }

    @Test
    void getInt() {
        assertEquals(1, optionalSample.getInt());
    }

    @Test
    void getDouble() {
        assertEquals(3.14, optionalSample.getDouble(), 0.0001);
    }

    @Test
    void getNull() {
        assertThrows(IllegalStateException.class, ()->optionalSample.getNull());
    }

    @Test
    void getAbsent() {
        assertThrows(IllegalStateException.class, ()->optionalSample.getAbsent());
    }

    @Test
    void orInt() {
        assertEquals(0, optionalSample.orInt());
    }

    @Test
    void orIntDefaultValue() {
        assertEquals(5, optionalSample.orIntDefaultValue());
    }

    @Test
    void orDouble() {
        assertEquals(3.14, optionalSample.orDouble(), 0.001);
    }

    @Test
    void orDoubleDefaultValue() {
        assertEquals(3.14, optionalSample.orDoubleDefaultValue(), 0.001);
    }

    @Test
    void orNumber() {
        assertEquals(0, optionalSample.orNumber());
    }

    @Test
    void orNumberDefaultValue() {
        assertEquals(3.14, optionalSample.orNumberDefaultValue());
    }

    @Test
    void orString() {
        assertEquals("abc", optionalSample.orString());
    }

    @Test
    void orStringDefaultValue() {
        assertEquals("", optionalSample.orStringDefaultValue());
    }

    @Test
    void orNullInt() {
        assertEquals(1, optionalSample.orNullInt());
    }

    @Test
    void orNullIntAbsent() {
        assertNull(optionalSample.orNullIntAbsent());
    }

    @Test
    void orNullIntNull() {
        assertNull(optionalSample.orNullIntNull());
    }

    @Test
    void orNullDouble() {
        assertEquals(3.14, optionalSample.orNullDouble(), 0.001);
    }

    @Test
    void orNullDoubleAbsent() {
        assertNull(optionalSample.orNullDoubleAbsent());
    }

    @Test
    void orNullDoubleNull() {
        assertNull(optionalSample.orNullDoubleNull());
    }

    @Test
    void orNullString() {
        assertEquals("", optionalSample.orNullString());
    }

    @Test
    void orNullStringAbsent() {
        assertNull(optionalSample.orNullStringAbsent());
    }

    @Test
    void orNullStringNull() {
        assertNull(optionalSample.orNullStringNull());
    }

    @Test
    void asSetInteger() {
        Set<Integer> sets = optionalSample.asSetInteger();
        assertEquals(1, sets.size());

        for (int value : sets) {
            assertEquals(1, value);
        }
    }

    @Test
    void asSetDouble() {
        Set<Double> sets = optionalSample.asSetDouble();
        assertEquals(1, sets.size());

        for (double value : sets) {
            assertEquals(3.14, value, 0.001);
        }
    }

    @Test
    void asSetString() {
        Set<String> sets = optionalSample.asSetString();
        assertEquals(1, sets.size());

        for (String value : sets) {
            assertEquals( "", value);
        }
    }

    @Test
    void asSetNull() {
        assertEquals(0, optionalSample.asSetNull().size());
    }
}