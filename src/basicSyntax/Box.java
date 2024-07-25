package basicSyntax;

public class Box {
    private int width;
    private int height;
    private int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getVolume() {
        return width * height * length;
    }

    public int compare(Box box) {
        if (box.getVolume() > this.getVolume()) {
            return 1;
        } else if (box.getVolume() < this.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box cloneBox() {
        return new Box(width, height, length);
    }
}
