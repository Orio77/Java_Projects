package Arrays.Ex14;

public class FindMatchingElement {
    
    public static String checkforMatchingElements(String[] array_1, String[] array_2) { 

        String duplicatedElement = "";

        for (int i = 0; i < array_1.length; i++) {
            String currentElement = array_1[i];

            for (int j = 0; j < array_1.length; j++) {
                if (currentElement.matches(array_2[j])) {
                    duplicatedElement = currentElement;
                }
            }
        }

        if (duplicatedElement.matches("")) {
            System.out.print("There are no matching elements in the arrays");
            return duplicatedElement;
        }
        else {
            System.out.print("Matching element is: " + duplicatedElement);
            return duplicatedElement;
        }    
    }
}
