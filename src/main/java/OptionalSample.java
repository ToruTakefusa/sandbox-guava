import com.google.common.base.Optional;
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
}
