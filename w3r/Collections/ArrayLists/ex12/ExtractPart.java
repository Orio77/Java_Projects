package Collections.ArrayLists.ex12;

import java.util.ArrayList;

public class ExtractPart {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        extract(list, 5, 21);
        
    }

    public static void extract(ArrayList<Integer> arrayList, int beginningIndex, int endIndex) {

        ArrayList<Integer> subList = new ArrayList<>();
        
        try {
            for (int i = beginningIndex; i < endIndex; i++) {
                subList.add(arrayList.get(i));
            }
            System.out.println(subList);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Can not operate on given indexes");
            System.out.println("Index Range: " + "0" + " - " + arrayList.size());
            return;
        }
    }
}



//12. Write a Java program to extract a portion of an array list.
