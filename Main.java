public class Main {
    public static void main(String[] args) {
        /* Computer */

        Laptop laptop = new Laptop("Lenovo", "Windows 10", 16, 15);
        laptop.displaySpecs();
        laptop.start();

        System.out.println();

        Iphone Iphone = new Iphone("Apple", "iOS 14", 4, 1080);
        Iphone.displaySpecs();
        Iphone.start();
        Iphone.makeCall();

        /* FastFood */

        FastFood[] menu = new FastFood[3];
        menu[0] = new Sandwich();
        menu[1] = new Pizza();
        menu[2] = new FrenchFries();

        for (FastFood food : menu) {
            food.prepare();
            food.cook();
            food.serve();
            System.out.println();
        }

        /* Bike Vehicle */

        Bike bike1 = new Bike();
        bike1.changeGear(2);
        bike1.speedUp(3);
        bike1.applyBrakes(1);
        System.out.println("Bike 1: ");
        bike1.printStates();

        Bike bike2 = new Bike();
        bike2.changeGear(1);
        bike2.speedUp(4);
        bike2.applyBrakes(2);
        System.out.println("Bike 2: ");
        bike2.printStates();

        /* RapSong */
        RapSong rapSong = new RapSong();
        OldSchoolRap oldSchoolRap = new OldSchoolRap();
        NewSchoolRap newSchoolRap = new NewSchoolRap();

        rapSong.play();
        oldSchoolRap.play();
        newSchoolRap.play();

    }
}
