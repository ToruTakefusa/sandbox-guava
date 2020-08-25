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
        assertEquals(optionalSample.getString(), "foo");
    }

    @Test
    void getEmptyString() {
        assertEquals(optionalSample.getEmptyString(), "");
    }

    @Test
    void getInt() {
        assertEquals(optionalSample.getInt(), 1);
    }

    @Test
    void getDouble() {
        assertEquals(optionalSample.getDouble(), 3.14, 0.0001);
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
        assertEquals(optionalSample.orInt(), 0);
    }

    @Test
    void orIntDefaultValue() {
        assertEquals(optionalSample.orIntDefaultValue(), 5);
    }

    @Test
    void orDouble() {
        assertEquals(optionalSample.orDouble(), 3.14, 0.001);
    }

    @Test
    void orDoubleDefaultValue() {
        assertEquals(optionalSample.orDoubleDefaultValue(), 3.14, 0.001);
    }

    @Test
    void orNumber() {
        assertEquals(optionalSample.orNumber(), 0);
    }

    @Test
    void orNumberDefaultValue() {
        assertEquals(optionalSample.orNumberDefaultValue(), 3.14);
    }

    @Test
    void orString() {
        assertEquals(optionalSample.orString(), "abc");
    }

    @Test
    void orStringDefaultValue() {
        assertEquals(optionalSample.orStringDefaultValue(), "");
    }

    @Test
    void orNullInt() {
        assertEquals(optionalSample.orNullInt(), 1);
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
        assertEquals(optionalSample.orNullDouble(), 3.14, 0.001);
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
        assertEquals(optionalSample.orNullString(), "");
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
        assertEquals(sets.size(), 1);

        for (int value : sets) {
            assertEquals(value, 1);
        }
    }

    @Test
    void asSetDouble() {
        Set<Double> sets = optionalSample.asSetDouble();
        assertEquals(sets.size(), 1);

        for (double value : sets) {
            assertEquals(value, 3.14);
        }
    }

    @Test
    void asSetString() {
        Set<String> sets = optionalSample.asSetString();
        assertEquals(sets.size(), 1);

        for (String value : sets) {
            assertEquals( "", value);
        }
    }

    @Test
    void asSetNull() {
        assertEquals(0, optionalSample.asSetNull().size());
    }
}