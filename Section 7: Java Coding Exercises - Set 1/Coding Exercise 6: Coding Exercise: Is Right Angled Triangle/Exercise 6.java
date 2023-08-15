public class TriangleValidator {
    public boolean isRightAngled(int side1, int side2, int side3) {
    // write your code
        if(side1 > 0 && side2 > 0 && side3 > 0){
            double squareSide1 = Math.pow(side1, 2);
            double squareSide2 = Math.pow(side2, 2);
            double squareSide3 = Math.pow(side3, 2);
            
            boolean isRightAngle12 = squareSide1 + squareSide2 == squareSide3;
            boolean isRightAngle31 = squareSide3 + squareSide1 == squareSide2;
            boolean isRightAngle23 = squareSide2 + squareSide3 == squareSide1;

            return isRightAngle12 || isRightAngle31 || isRightAngle23;
        }
        
        return false;
    }
}