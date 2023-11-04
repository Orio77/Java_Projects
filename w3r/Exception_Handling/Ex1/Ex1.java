package Exception_Handling.Ex1;

public class Ex1 {
    public static void tryCatch() {

        try {
            int word = Integer.parseInt("not int lol");
            System.out.println(word);
        } 
        catch (NumberFormatException e) {
            System.out.println("Exception caught succesfully");
        }
        catch (Exception e) {
            System.out.println("Exception caught succesfully");
        }
    }
}
