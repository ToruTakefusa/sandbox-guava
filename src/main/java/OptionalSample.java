import com.google.common.base.Optional;

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
}
