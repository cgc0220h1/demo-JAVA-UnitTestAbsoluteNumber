public class AbsoluteNumberCalculator {

    public static final int ZERO = 0;
    public static final int NEGATIVE_ONE = -1;

    public static int findAbsolute(int number) {
        if (number < ZERO) {
            return number * NEGATIVE_ONE;
        }
        return number;
    }
}
