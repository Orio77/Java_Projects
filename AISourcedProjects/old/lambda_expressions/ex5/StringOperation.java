package ex5;

@FunctionalInterface
public interface StringOperation {
    
    String run(String string);

    default String append(String string) {
        return string + " og";
    }
}