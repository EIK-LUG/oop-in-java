
/*
* Make an equilateral triangle class
*
* The constructor of the class takes the lengths of the sides
* All fields in the class are private
* Implement the following methods:
*
*   calculateArea
*   calculatePerimeter
*   equals
*
* */

class EquilateralTriangle {

    private double sideLengths;

    EquilateralTriangle(double sideLengths) {
        this.sideLengths = sideLengths;
    }

    double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(this.sideLengths, 2);
    }

    double calculatePerimeter() {
        return this.sideLengths*3;
    }

    public boolean compareToOther(EquilateralTriangle other) {
        return this.sideLengths == other.sideLengths;
    }

}

public class TriangleExample {

    public static void main(String[] args) {

        EquilateralTriangle eqlTriangle = new EquilateralTriangle(1.5);

        System.out.println(eqlTriangle.calculateArea());

        System.out.println(eqlTriangle.calculatePerimeter());

        System.out.println(eqlTriangle.compareToOther(new EquilateralTriangle(1.5)));

        System.out.println(eqlTriangle.compareToOther(new EquilateralTriangle(2.0)));

    }
}
