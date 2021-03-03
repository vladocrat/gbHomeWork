public class CatsToFeed {
    private String name;
    private int appetite;
    private boolean fed;
    public CatsToFeed(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fed = false;
    }
    public void eat(Plate plate) {
        if(plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fed = true;
        } else {
            return;
        }
    }

    public void getFed(){
        if(fed) {
            System.out.println(this.name + " is fed");
        } else {
            System.out.println(this.name + " is not fed");
        }
    }
}
