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
}