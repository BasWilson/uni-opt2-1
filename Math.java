import java.util.Random;

public class Math {
    
    public static int randomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
