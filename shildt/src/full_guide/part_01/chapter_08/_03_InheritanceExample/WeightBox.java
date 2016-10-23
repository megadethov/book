package full_guide.part_01.chapter_08._03_InheritanceExample;

/**
 * Created by mega on 25.08.2016.
 */
public class WeightBox extends Box {

    int boxWeight;

    public WeightBox(int height, int width, int depth, int boxWeight) {
        super(height, width, depth);
        this.boxWeight = boxWeight;
    }
}
