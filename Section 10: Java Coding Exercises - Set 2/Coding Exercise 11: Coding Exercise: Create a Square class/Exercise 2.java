public class Square {

    private int side;

    public Square(int side) {
        // TODO: Initialize side with the passed value
        this.side = side;
    }

    public int calculateArea() {
        // TODO: Calculate and return the area of the square
        int area = (int) Math.pow(side, 2);
        return side > 0 ? area : -1;
    }

    public int calculatePerimeter() {
        // TODO: Calculate and return the perimeter of the square
        int perimeter = 4 * side;
        return side > 0 ? perimeter : -1;
    }

}