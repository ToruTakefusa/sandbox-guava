import com.google.common.base.Optional;
import com.sun.java.accessibility.util.TopLevelWindowListener;

import javax.swing.text.html.Option;

public class OptionalSample {
    public Optional optionalOfNull() {
        return Optional.of(null);
    }

    public boolean isOptionalAbsentNull() {
        return java.util.Objects.isNull(Optional.absent());
    }

    public boolean isOptionalAbsentPresent() {
        return Optional.absent().isPresent();
    }

    public boolean isFromNullableNull() {
        return java.util.Objects.isNull(Optional.fromNullable(null));
    }

    public boolean isFromNullableNullPresent() {
        return Optional.fromNullable(null).isPresent();
    }

    public boolean isFromNullableStringPresent() {
        return Optional.fromNullable("foo").isPresent();
    }

    public String getString() {
        return Optional.of("foo").get();
    }

    public String getEmptyString() {
        return Optional.of("").get();
    }

    public int getInt() {
        return Optional.of(1).get();
    }

    public double getDouble() {
        return Optional.of(3.14).get();
    }

    public Object getNull() {
        return Optional.fromNullable(null).get();
    }

    public Object getAbsent() {
        return Optional.absent().get();
    }

    public int orInt() {
        return Optional.of(0).or(1);
    }

    public int orIntDefaultValue() {
        Optional<Integer> optional = Optional.fromNullable(null);
        return optional.or(5);
    }

    public double orDouble() {
        return Optional.of(3.14).or(0.15);
    }

    public double orDoubleDefaultValue() {
        Optional<Double> optional = Optional.fromNullable(null);
        return optional.or(3.14);
    }

    public Number orNumber() {
        Optional<Number> optional = Optional.of(0);
        return optional.or(3.14);
    }

    public Number orNumberDefaultValue() {
        Optional<Number> optional = Optional.fromNullable(null);
        return optional.or(3.14);
    }

    public String orString() {
        Optional<String> optional = Optional.of("abc");
        return optional.or("");
    }

    public String orStringDefaultValue() {
        Optional<String> optional = Optional.fromNullable(null);
        return optional.or("");
    }
}
