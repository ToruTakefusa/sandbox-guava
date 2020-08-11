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
}
