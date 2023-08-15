public class TriangleValidator {
    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
        // write your code here\
        boolean upperThanZeroAngles = angle1 > 0 && angle2 > 0 && angle3 > 0;
        int sumAngles = angle1 + angle2 + angle3;
        boolean isValid = sumAngles == 180;
        
        return upperThanZeroAngles && isValid;
    }
}