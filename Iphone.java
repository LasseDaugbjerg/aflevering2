public class Iphone extends Computer {
        private int screenResolution;

        public Iphone(String manufacturer, String operatingSystem, int RAM, int screenResolution) {
            super(manufacturer, operatingSystem, RAM);
            this.screenResolution = screenResolution;
        }

        public void displaySpecs() {
            super.displaySpecs();
            System.out.println("Screen Resolution: " + screenResolution + " pixels");
        }

        public void makeCall() {
            System.out.println("Making a call...");
        }
    }

