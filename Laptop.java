public class Laptop extends Computer {
        private int screenSize;

        public Laptop(String manufacturer, String operatingSystem, int RAM, int screenSize) {
            super(manufacturer, operatingSystem, RAM);
            this.screenSize = screenSize;
        }

        public void displaySpecs() {
            super.displaySpecs();
            System.out.println("Screen Size: " + screenSize + " inches");
        }
    }

