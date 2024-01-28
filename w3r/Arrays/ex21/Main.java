package Arrays.ex21;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }

        System.out.println(Arrays.toString(ConvertArray.convertArrayList(list)));
    }
}


//21. Write a Java program to convert an ArrayList to an array.