public class Cat extends Animal{

    private String name;
    public static int catCount = 0;
    public Cat(String name) {
        super(name);
        catCount++;
    }

    public int getCatCount() {
        return catCount;
    }

    public void run(int distance) {
        if(distance > 200) {
            System.out.println(this.name + " can't run that far");
        } else {
            System.out.println(this.name + " ran " + distance);
        }
    }

    public void swim(int distance) {
        System.out.println(this.name + " can't swim");
    }
}
