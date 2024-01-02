package ex5;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("LEVEL 1 & 2");
        StringOperation level1 = (s) -> s.toUpperCase();
        
        System.out.println(level1.run("dog"));
        System.out.println(level1.append("append me"));

        StringModifier level3 = (s, o) -> o.run(s); 

        System.out.println("LEVEL 3");
        System.out.println(level3.modify("dog", level1));
    }
}
