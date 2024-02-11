package streamAPI.exercise2_ambdaExpressions.scenario1;

import java.util.function.BiFunction;

@FunctionalInterface
public interface Addition {
    
    public abstract int add(int a, int b, BiFunction<Integer, Integer, Integer> adder);
}
