package HomeWork_1;

import org.example.logger.HomeWork_2.Log;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class StringUtil {
    public static void main(String[] args) {

    }

    public static String convertIntArray(int[] ints) {
        Log.LOG.info("Метод convertIntArray запускается");
        return Arrays.stream(ints).mapToObj(i -> i +"").reduce((x,y) -> x +" " + y ).get();
    }
}
