/**
 * Functional interface representing a contract for creating a string
 * based on an input string and an integer.
 * This interface has a single abstract method which makes it a functional interface,
 * allowing it to be used as the assignment target for a lambda expression or method reference.
 * Usage example:
 * <pre>
 * {@code
 *  Wordable wordable = (s, n) -> s.repeat(n);
 *  String result = wordable.createString("hello", 3); // result will be "hellohellohello"
 * }
 * </pre>
 *
 * @author Marius Guerra, Andres Arevalo && Hamrazz
 */
@FunctionalInterface
public interface Wordable {

    /**
     * Creates a string based on the provided input string and integer.
     *
     * @param s the input string
     * @param n the number of times the input string should be repeated or any other
     *          operation as defined by the implementing class
     * @return the resultant string after applying the operation
     */
    String createString(final String s, final int n);
}
