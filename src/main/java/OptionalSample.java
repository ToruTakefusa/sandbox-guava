import com.google.common.base.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        OptionalSample optionalSample = new OptionalSample();
        optionalSample.practiceOptionalOf();
        optionalSample.practiceAbsent();
    }

    private void practiceOptionalOf() {
        String s1 = "foo";
        try {
            Optional.of(s1);
        } catch (NullPointerException ex) {
            System.out.println("s1 is null");
        }

        try {
            Optional.of(null);
        } catch (NullPointerException ex) {
            System.out.println("Optional.of(null) throw NullPointerException");
        }
    }

    private void practiceAbsent() {
        Optional ret = Optional.absent();
        if (java.util.Objects.isNull(ret)) {
            System.out.println("ret is null");
        }
        if (ret.isPresent()) {
            System.out.println("ret is not null");
        } else {
            System.out.println("ret is absent");
        }
    }

    private void fromNullable() {

    }

}
