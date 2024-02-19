import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

/**
 * CustomCollector
 */
public class CustomCollector {

    Collector<String, StringBuilder, String> collector = Collector.of(
    StringBuilder::new, // supplier
    StringBuilder::append, // accumulator
    (sb1, sb2) -> sb1.append(',').append(sb2), // combiner
    StringBuilder::toString); // finisher

    List<String> list = Arrays.asList("a", "b", "c");
    String result = list.stream().collect(collector); // "a,b,c"
}