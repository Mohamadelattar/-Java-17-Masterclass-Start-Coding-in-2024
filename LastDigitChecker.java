public class LastDigitChecker {
    // write code here
    public static boolean hasSameLastDigit(int first , int second , int third) {
        if(!isValid(first) || !isValid(second) || !isValid(third))
            return false;
        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        return firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || secondLastDigit == thirdLastDigit;
    }

    public static boolean isValid(int num) {
        return (num >= 10 && num <= 1000);
    }
}