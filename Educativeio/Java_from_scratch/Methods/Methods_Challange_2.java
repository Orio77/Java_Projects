package Java_from_scratch.Methods;
public class Methods_Challange_2 {
    public static void main(String[] args) {

        System.out.println(grader("wg"));

    }
    private static double grader(String grade) {
        
        switch(grade) {
            case "A+":
                return 4;
            case "A":
                return 4;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3;
            case "B-":
                return 2.8;
            case "C+":
                return 2.5;
            case "C":
                return 2;
            case "C-":
                return 1.8;
            case "D":
                return 1.5;
            case "F":
                return 0;
            default:
                return -1;
        }
    }
}