package rest;
import java.util.ArrayList;
import java.util.List;

import drive.Drive;

public class Computer {
    private Monitor monitor;
    private Drive Drive;
    private Headphones headphones;

    List<USBDevice> usbDevices = new ArrayList<>();

    public Computer(Drive Drive, Monitor monitor) {
        this.Drive = Drive;
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Drive getDrive() {
        return Drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setDrive(Drive Drive) {
        this.Drive = Drive;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }
}