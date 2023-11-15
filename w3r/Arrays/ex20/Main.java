package Arrays.ex20;

public class Main {
    public static void main(String[] args) {
        
        Integer[] arrayI = {1, 2, 3, 4, 5};
        String[] arrayS = {"dog", "cat", "milk"};

       
        System.out.println(ConvertArrayList.convertArray(arrayI));
        System.out.println(ConvertArrayList.convertArray(arrayS));
        System.out.println(ConvertArrayList.convertArrayV2(arrayI));
    }  
}


//20. Write a Java program to convert an array to an ArrayList.