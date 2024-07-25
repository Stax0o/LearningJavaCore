package inheritance;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(int width, int height, int depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.printf("weight: %.2f\n", weight);
    }
}
