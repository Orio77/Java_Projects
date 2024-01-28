package Medium;

public class FindTriangleSides {

    public static double[] findOtherSides(int side_1) {

        double side_3 = Math.round(side_1 * 2);
        double side_2 = Math.round(side_1 * Math.sqrt(3));
        
        double[] result = {side_3, side_2};

        return result;
    }
}





/*Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. 
Return the longest side and medium-length side in that order. */