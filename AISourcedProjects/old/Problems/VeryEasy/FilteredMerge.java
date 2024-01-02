package VeryEasy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilteredMerge {
    public List<Integer> mergeAndFilter(List<Integer> list1, List<Integer> list2, int treshold) {
        
        return Stream.concat(list1.stream(), list2.stream()).filter(n -> n > treshold).collect(Collectors.toList());        
    }
}
