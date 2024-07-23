public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        double indiceConvert = 1.609;
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / indiceConvert) ;
    }
}
