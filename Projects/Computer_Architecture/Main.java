import drive.HDDDrive;
import drive.SSDDrive;
import rest.Computer;
import rest.File;
import rest.Monitor;

public class Main {
    public static void main(String[] args) {

        HDDDrive drive = new HDDDrive();
        SSDDrive drive1 = new SSDDrive();
        Monitor monitor = new Monitor();
        
        Computer computer = new Computer(drive1, monitor);

        File file = new File("abcd.jpg");

        drive.addFile(file);
        drive.listFiles();
    }
}
