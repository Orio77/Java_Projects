import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class OddEvenSort {
    public static List<Integer> sortOddEven(List<Integer> nums) {

        List<Integer> evenList = nums.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());
        
        List<Integer> oddList = nums.stream()
                                        .filter(n -> n % 2 != 0)
                                        .collect(Collectors.toList());

        oddList.addAll(evenList);

        return oddList;
    }

    //                           O(2n)
    public static List<Integer> betterSolution(List<Integer> nums) {

        List<Integer> evenList = nums.stream()
                                        .filter(n -> n % 2 ==0)
                                        .sorted()
                                        .collect(Collectors.toList());

        List<Integer> oddList = nums.stream()
                                        .filter(n -> n % 2 != 0)
                                        .sorted()
                                        .collect(Collectors.toList());

        return Stream.concat(evenList.stream(), oddList.stream())
                        .collect(Collectors.toList());
    }


    //                          O(n*log(n))
    public static List<Integer> bestSolution(List<Integer> nums) {

        Comparator<Integer> oddEvenComparator = (a, b) -> {
            int oddCompare = Boolean.compare(a % 2 == 0, b % 2 == 0);
            if (oddCompare != 0)
                return oddCompare;
            return a.compareTo(b);
        };

        return nums.stream()
                    .sorted(oddEvenComparator)
                    .collect(Collectors.toList());
    }
}