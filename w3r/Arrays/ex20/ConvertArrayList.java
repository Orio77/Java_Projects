package Arrays.ex20;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayList {

    //Method to convert any type of array into an ArrayList
    public static <T> ArrayList<T> convertArray(T[] array) {

        ArrayList<T> list = new ArrayList<>();

        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static <T> ArrayList<T> convertArrayV2(T[] array) {

        return new ArrayList<>(Arrays.asList(array));
    }
}
