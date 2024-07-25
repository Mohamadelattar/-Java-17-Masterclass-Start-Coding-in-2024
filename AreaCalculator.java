public class AreaCalculator {
    // write code here
    public static double area(double radius) {
        if(radius < 0) return -1;

        return Math.PI * radius * radius;
    }

    public static double area(double x , double y) {
        if( x < 0 || y < 0)    return -1;
        return x * y;
    }


}