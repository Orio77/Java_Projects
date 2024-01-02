package Collections.TreeSet.ex2_4;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises {
    public static void main(String[] args) {

        TreeSet<Integer> myTreeSet = new TreeSet<>();
        TreeSet<Integer> myTreeSet$ = new TreeSet<>();

        for (int i = 1; i <= 20; i++) {
            myTreeSet.add(i);
        }

        for (int i = 1; i <= 10; i++) {
            myTreeSet$.add(i);
        }
        
        //2.
        // System.out.println(myTreeSet);
        // iterateTreeSet(myTreeSet);

        //3.
        // System.out.println(myTreeSet);
        // System.out.println(myTreeSet$);
        // addAllElements(myTreeSet, myTreeSet$);
        // System.out.println(myTreeSet);
        // System.out.println(myTreeSet$);

        //4.
        // System.out.println(myTreeSet);
        // reverseView(myTreeSet);

        //5.
        // System.out.println(myTreeSet);
        // getFirstLast(myTreeSet);

        //6.

        //7.
        // System.out.println(myTreeSet);
        // getSize(myTreeSet);

        //8.
        // System.out.println(myTreeSet);
        // System.out.println(myTreeSet$);
        // compareTrees(myTreeSet, myTreeSet$);
    }


    //2. Write a Java program to iterate through all elements in a tree set.
    public static void iterateTreeSet(TreeSet<Integer> treeSet) {

        for (int element : treeSet)
            System.out.print(element + ", ");
    }

    //3. Write a Java program to add all the elements of a specified tree set to another tree set.
    public static void addAllElements(TreeSet<Integer> treeSet1, TreeSet<Integer> treeSet2) {

        treeSet2.addAll(treeSet1);
    }

    //4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
    public static void reverseView(TreeSet<Integer> treeSet) {

        Iterator<Integer> iterator = treeSet.descendingIterator();
        
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }

    //5. Write a Java program to get the first and last elements in a tree set.
    public static void getFirstLast(TreeSet<Integer> treeSet) {

        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());
    }

    //6. Write a Java program to clone a tree set list to another tree set

    //7. Write a Java program to get the number of elements in a tree set.
    public static void getSize(TreeSet<Integer> treeSet) {

        System.out.println("Size of the Tree Set is: " + treeSet.size());
    }

    //8. Write a Java program to compare two tree sets.
    public static void compareTrees(TreeSet<Integer> treeSet1, TreeSet<Integer> treeSet2) {

        TreeSet<Integer> commonElementsTreeSet = new TreeSet<>();
        Iterator<Integer> iterator1 = treeSet1.iterator();
        Iterator<Integer> iterator2 = treeSet2.iterator();

        int element1 = iterator1.next();
        int element1$ = iterator2.next();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            if (element1 == element1$)
                commonElementsTreeSet.add(element1);
                if (iterator1.hasNext() && iterator2.hasNext()) {
                    element1 = iterator1.next();
                    element1$ = iterator2.next();
                }
        }
        commonElementsTreeSet.add(element1);


        System.out.println("Common Elements TreeSet: ");
        System.out.println(commonElementsTreeSet);
    }
}
