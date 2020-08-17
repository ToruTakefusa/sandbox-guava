import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OptionalSampleTest {
    OptionalSample optionalSample;

    @BeforeEach
    void setUp() {
        optionalSample = new OptionalSample();
    }

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
}