/**
 * This class contains the main method which prints "Hello World".
 */
public final class HelloAll {
    private HelloAll() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * This is the main method which makes use of displayMessage method.
     *
     * @param args Unused.
     */
    public static void main(final String... args) {
        System.out.println("Hello World");
    }
}
