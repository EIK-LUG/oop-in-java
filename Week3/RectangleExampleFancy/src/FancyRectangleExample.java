

class FancyRectangle {

    private double width;
    private double height;

    public enum comparisonKeyword {
        AREA,
        PERIMETER,
        SIDES
    };

    FancyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return width * height;
    }

    public double calcPerimeter() {
        return 2*width + 2*height;
    }

    private boolean isEqualSidesWise(FancyRectangle otherRect) {
        return this.height == otherRect.height && this.width == otherRect.width;
    }

    private boolean isEqualAreaWise(FancyRectangle otherRect) {
        return this.calcArea() == otherRect.calcArea();
    }

    private boolean isEqualPerimeterWise(FancyRectangle otherRect) {
        return this.calcPerimeter() == otherRect.calcPerimeter();
    }

    public boolean isEqual(FancyRectangle otherRect, comparisonKeyword equalityType) {

        if (equalityType == comparisonKeyword.SIDES) {

            return this.isEqualSidesWise(otherRect);

        } else if (equalityType == comparisonKeyword.AREA) {

            return isEqualAreaWise(otherRect);

        } else if (equalityType == comparisonKeyword.PERIMETER) {

            return isEqualPerimeterWise(otherRect);

        } else {
            throw new RuntimeException("Equality for constant not defined.");
        }
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

}

public class FancyRectangleExample {


    public static void main(String[] args) {
        FancyRectangle rect1 = new FancyRectangle(1, 1);
        FancyRectangle rect2 = new FancyRectangle(2, 2);

        System.out.println(rect1.calcArea());
        System.out.println(rect1.calcPerimeter());
        System.out.println(rect1.isSquare());

        System.out.println(rect1.isEqual(rect2, FancyRectangle.comparisonKeyword.PERIMETER));

    }

}
