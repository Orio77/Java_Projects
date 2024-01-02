package ex1;

public class LambdaSquare{
    
    public static void main(String[] args) {
        Square square = (n) -> n * n;
    
        int result = square.calculate(235);
    
        System.out.println(result);
    }
    
}
