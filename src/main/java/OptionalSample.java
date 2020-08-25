import com.google.common.base.Optional;

import java.util.Set;

/**
 * Sandbox of Optional.
 */
public class OptionalSample {
    /**
     * Optional.of(null) throws NullPointerExceptions
     * @return
     */
    public Optional optionalOfNull() {
        return Optional.of(null);
    }

    /**
     * Optional.absent() is not null.
     * @return
     */
    public boolean isOptionalAbsentNull() {
        return java.util.Objects.isNull(Optional.absent());
    }

    /**
     * Optional.absent() is not present.
     * @return
     */
    public boolean isOptionalAbsentPresent() {
        return Optional.absent().isPresent();
    }

    /**
     * Optional.fromNullable(null) is not null.
     * @return
     */
    public boolean isFromNullableNull() {
        return java.util.Objects.isNull(Optional.fromNullable(null));
    }

    /**
     * Optional.fromNullable(null) is not present.
     * @return
     */
    public boolean isFromNullableNullPresent() {
        return Optional.fromNullable(null).isPresent();
    }

    /**
     * Optional.fromNullable(String) is present.
     * @return
     */
    public boolean isFromNullableStringPresent() {
        return Optional.fromNullable("foo").isPresent();
    }

    /**
     * Optional.of(String).get() return String.
     * @return
     */
    public String getString() {
        return Optional.of("foo").get();
    }

    /**
     * Optional.of(Empty String).get() return Empty String.
     * @return
     */
    public String getEmptyString() {
        return Optional.of("").get();
    }

    /**
     * Optional.of(int).get() return int.
     * @return
     */
    public int getInt() {
        return Optional.of(1).get();
    }

    /**
     * Optional of(double).get() return double.
     * @return
     */
    public double getDouble() {
        return Optional.of(3.14).get();
    }

    /**
     * Optional.fromNullable(null).get() throws IllegalStateException.
     * @return
     */
    public Object getNull() {
        return Optional.fromNullable(null).get();
    }

    /**
     * Optional.absent().get() throws IllegalStateException.
     * @return
     */
    public Object getAbsent() {
        return Optional.absent().get();
    }

    /**
     * Optional.of(int).or(defaultValue) return int.
     * @return
     */
    public int orInt() {
        return Optional.of(0).or(1);
    }

    /**
     * Optional.fromNullable(null).or(defaultValue) return defaultValue.
     * @return
     */
    public int orIntDefaultValue() {
        Optional<Integer> optional = Optional.fromNullable(null);
        return optional.or(5);
    }

    /**
     * Optional.of(double).or(defaultValue) return double.
     * @return
     */
    public double orDouble() {
        return Optional.of(3.14).or(0.15);
    }

    /**
     * Optional.fromNullable(null).or(defaultValue) return defaultValue.
     * @return
     */
    public double orDoubleDefaultValue() {
        Optional<Double> optional = Optional.fromNullable(null);
        return optional.or(3.14);
    }

    /**
     * Optional.of(int).or(double) return int.
     * @return
     */
    public Number orNumber() {
        Optional<Number> optional = Optional.of(0);
        return optional.or(3.14);
    }

    /**
     * Optional.fromNullable(null).or(double) return double.
     * @return
     */
    public Number orNumberDefaultValue() {
        Optional<Number> optional = Optional.fromNullable(null);
        return optional.or(3.14);
    }

    /**
     * Optional.of(String).or(defaultValue) return String.
     * @return
     */
    public String orString() {
        Optional<String> optional = Optional.of("abc");
        return optional.or("");
    }

    /**
     * Optional.fromNullable(null).or(defaultValue) return defaultValue.
     * @return
     */
    public String orStringDefaultValue() {
        Optional<String> optional = Optional.fromNullable(null);
        return optional.or("");
    }

    /**
     * Optional.of(int).orNull return int.
     * @return
     */
    public int orNullInt() {
        Optional<Integer> optional = Optional.of(1);
        return optional.orNull();
    }

    /**
     * Optional.absent().orNull() return null.
     * @return
     */
    public Integer orNullIntAbsent() {
        Optional<Integer> optional = Optional.absent();
        return optional.orNull();
    }

    /**
     * Optional.fromNullable(null).orNull() return null;
     * @return
     */
    public Integer orNullIntNull() {
        Optional<Integer> optional = Optional.fromNullable(null);
        return optional.orNull();
    }

    /**
     * Optional.of(double).orNull() return double.
     * @return
     */
    public double orNullDouble() {
        Optional<Double> optional = Optional.of(3.14);
        return optional.orNull();
    }

    /**
     * Optional.absent().orNull() return null.
     * @return
     */
    public Double orNullDoubleAbsent() {
        Optional<Double> optional = Optional.absent();
        return optional.orNull();
    }

    /**
     * Optional.fromNullable(null) return null.
     * @return
     */
    public Double orNullDoubleNull() {
        Optional<Double> optional = Optional.fromNullable(null);
        return optional.orNull();
    }

    /**
     * Optional.of(String).orNull return String.
     * @return
     */
    public String orNullString() {
        Optional<String> optional = Optional.of("");
        return optional.orNull();
    }

    /**
     * Optional.absent().orNull return null.
     * @return
     */
    public String orNullStringAbsent() {
        Optional<String> optional = Optional.absent();
        return optional.orNull();
    }

    /**
     * Optional.fromNullable(null).orNull return null
     * @return
     */
    public String orNullStringNull() {
        Optional<String> optional = Optional.fromNullable(null);
        return optional.orNull();
    }

    public Set asSetInteger() {
        return Optional.of(1).asSet();
    }

    public Set asSetDouble() {
        return Optional.of(3.14).asSet();
    }

    public Set asSetString() {
        return Optional.of("").asSet();
    }

    public Set asSetNull() {
        return Optional.fromNullable(null).asSet();
    }

}
