package Basic_1.Ex31;

public class CheckJava {
    public static void printInfo() {

        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }
}
