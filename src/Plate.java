public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        if(food != 0) {
            food -= n;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
