package hidayLec8;

import java.util.Random;

/**
 * Created by hackeru on 16/02/2017.
 */
public class Utils {

    //privet fields
    private Utils() {}

    private static Random randGen = new Random();

    public static int getInt(){
        return randGen.nextInt();
    }

    public static int getInt(int from, int to){
        int random = from + randGen.nextInt(to - from + 1);
        return (random);
    }


}
