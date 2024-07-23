public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        int megaByte = kilobytes / 1024;
        int restKiloByte = kilobytes % 1024;
        System.out.println((kilobytes<0) ? "Invalid Value" : kilobytes + " KB = " + megaByte + " MB and " + restKiloByte + " KB" );
    }
}
