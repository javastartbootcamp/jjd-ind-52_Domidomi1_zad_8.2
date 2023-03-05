package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Online online1 = new Online(" Cinderella ", "Broadway", "Online ticket",
                220, 101, 10);
        online1.printInfo();
        System.out.println();

        Standard standard1 = new Standard(" Cruella", "Palladium", "standard ticket",
                150, 102, 20);
        standard1.printInfo();
        System.out.println();

        Gift gift1 = new Gift(" Alladyn", "Main Theatre", "gift ticket", 140,
                103, 30);
        gift1.printInfo();
    }

}

