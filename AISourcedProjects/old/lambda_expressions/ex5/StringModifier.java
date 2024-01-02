package ex5;

@FunctionalInterface
public interface StringModifier {
    
    String modify(String s, StringOperation operation);
}
