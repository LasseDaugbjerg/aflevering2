public class Computer {
    private String manufacturer;
    private String operatingSystem;
    private int RAM;

    public Computer(String manufacturer, String operatingSystem, int RAM) {
        this.manufacturer = manufacturer;
        this.operatingSystem = operatingSystem;
        this.RAM = RAM;
    }

    public void displaySpecs() {
        System.out.println("Manufacturer is: " + manufacturer);
        System.out.println("Operating System: is " + operatingSystem);
        System.out.println("RAM is: " + RAM + "GB");
    }

    public void start() {
        System.out.println("Starting the computer...");
    }
}