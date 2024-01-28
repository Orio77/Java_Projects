package Collections.ArrayLists.ex2;

import java.util.ArrayList;

public class ListIterator {
    public <T> void iterate(ArrayList<T> list) {

        for (T element : list) {
            System.out.println(element);
        }
    }
}
