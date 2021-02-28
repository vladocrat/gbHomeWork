public class Dog extends Animal{

    private String name;
    public static int dogCount = 0;
    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public int getDogCount() {
        return dogCount;
    }

    public void run(int distance) {
        if(distance > 500) {
            System.out.println(this.name + " can't run that far");
        } else {
            System.out.println(this.name + " ran " + distance);
        }
    }

    public void swim(int distance) {
        if(distance > 10) {
            System.out.println(this.name + " can't swim that far");
        } else {
            System.out.println(this.name + " swam " + distance);
        }
    }
}
