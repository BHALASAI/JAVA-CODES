/**
 * This class contains the main method which prints "Hello World".
 */
public class HelloAll {
    private HelloAll() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
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
