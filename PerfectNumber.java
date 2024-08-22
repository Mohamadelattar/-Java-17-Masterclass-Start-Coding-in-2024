public class PerfectNumber {
    // write code here
    public static boolean isPerfectNumber(int number){
        if(number < 1)
            return false;
        int sumDivisor = 0;
        for(int i = 1 ; i < number ; i++) {
            if(number % i == 0) {
                sumDivisor += i;
            }
        }

        return sumDivisor == number;
    }
}