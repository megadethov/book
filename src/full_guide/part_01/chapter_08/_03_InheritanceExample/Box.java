package full_guide.part_01.chapter_08._03_InheritanceExample;

/**
 * Created by mega on 25.08.2016.
 */
public class Box {
    int height;
    int width;
    int depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    void volume(Box box) {
        System.out.println("Volume = " + box.height * box.width * box.depth);
    }
}
