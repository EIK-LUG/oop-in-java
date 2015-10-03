

class Rectangle {

    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return width * height;
    }

    public double calcPerimeter() {
        return 2*width + 2*height;
    }

    public boolean isEqual(Rectangle otherRect) {
        return this.height == otherRect.height && this.width == otherRect.width;
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

}

public class RectangleExample {


    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(1, 1);
        Rectangle rect2 = new Rectangle(2, 2);

        System.out.println(rect1.calcArea());
        System.out.println(rect1.calcPerimeter());
        System.out.println(rect1.isSquare());

        System.out.println(rect1.isEqual(rect2));

    }

}
