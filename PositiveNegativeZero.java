public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        System.out.println((number < 0) ? "negative" :
                (number > 0) ? "positive"  : "zero");
    }
}
