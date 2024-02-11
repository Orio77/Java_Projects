package streamAPI.exercise2_ambdaExpressions.scenario1;

@FunctionalInterface
public interface StringOperation {
    
    public abstract String applyStringOperation(String str, StringOperation operation);
}
