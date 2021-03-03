public class Homework7 {
    public static void main(String[] args) {
        Plate plate = new Plate(70);
        CatsToFeed[] cats = new CatsToFeed[3];
        CatsToFeed cat = new CatsToFeed("Chishir", 20);
        CatsToFeed cat2 = new CatsToFeed("Semen", 50);
        CatsToFeed cat3 = new CatsToFeed("Dusia", 10);
        cats[0] = cat;
        cats[1] = cat3;
        cats[2] = cat2;

        plate.info();
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }

        for (int i = 0; i < cats.length; i++) {
            cats[i].getFed();
        }
    }
}

