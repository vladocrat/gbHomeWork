public class Animal {

    private String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public int getCount() {
        return count;
    }

    public void run(int distance) {

    }
    public void swim(int distance) {

    }

    public static void main(String[] args) {

    }
}
