public class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean summer , int temperature){
        if(summer)
            return temperature < 46 && temperature > 24;

        return temperature < 36 && temperature > 24;
    }
}