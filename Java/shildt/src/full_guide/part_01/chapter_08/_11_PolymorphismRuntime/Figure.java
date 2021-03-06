package full_guide.part_01.chapter_08._11_PolymorphismRuntime;

/**
 * Created by mega on 26.08.2016.
 */
public class Figure {
    double dim1;
    double dim2;

    public Figure(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        System.out.println("Method area() not defined for figure");
        return 0;
    }
}

class Rectangle extends Figure {

    public Rectangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {

    public Triangle(int dim1, int dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1 * dim2 / 2;
    }
}
