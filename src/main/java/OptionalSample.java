import com.google.common.base.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        OptionalSample optionalSample = new OptionalSample();
        optionalSample.practiceOf();
    }

    private void practiceOf() {
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
}
