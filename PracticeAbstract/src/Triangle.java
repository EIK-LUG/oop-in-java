import java.util.HashMap;

public class Triangle {

    //Some properties a triangle has
    int nrOfCorners = 3;
    int perimeter;
    int area;
    int altitude;

    //Useful constants to be able to reference the different sides
    enum sideReference {
        base,
        sideOne,
        sideTwo
    }

    //Key value pairs: sideReference -> side length
    HashMap<sideReference, Integer> sideLengths;

    //The constructor
    Triangle(int sideSize1, int sideSize2, int sideSize3) {
        //Setup for creating an instance of this class
    }


    void flipLeft() {
        //Flip the triangle left, modify sideLengths

    }

    void flipRight() {
        //Flip the triangle right, modify sideLengths
    }

    boolean isIsoscelesTriangle() {
        //Check if this triangle is Isosceles (base and two equal length sides)
        return false;
    }

}
