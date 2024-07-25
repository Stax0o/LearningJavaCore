package inheritance;

public class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public void showInfo(){
        System.out.printf("width: %d\nheight: %d\ndepth: %d%n", width, height, depth);
    }
}
