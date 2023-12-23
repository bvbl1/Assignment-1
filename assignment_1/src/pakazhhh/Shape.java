package pakazhhh;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points = new ArrayList<>(); //Stores the points to create shape

    public void addPoint(Point point) {
        points.add(point);
    }


    /*Calculating distance between i which is index of first point
    * and j which is index of second point*/
    private double calculateSideLength(int i, int j) {
        return points.get(i).distanceTo(points.get(j));
    }


    /*Calculating perimeter, where we create variable
    where we gonna store all distances between points with "for loop"*/
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            perimeter += calculateSideLength(i, (i + 1) % points.size());
        }
        return perimeter;
    }
    /*Finding the longest side, where first of all create variable,
    store there first side and compare with next side, and replace it if new side is longer,
    and doing it till the end */
    public double getLongestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.size(); i++) {
            longestSide = Math.max(longestSide, calculateSideLength(i, (i + 1) % points.size()));
        }
        return longestSide;
    }

    /*dividing perimeter by number of sides to find the average side*/
    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }
}
