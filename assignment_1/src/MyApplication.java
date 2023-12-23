import pakazhhh.Point;  //importing classes from package
import pakazhhh.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\User\\IdeaProjects\\assignment_1\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {   //reading coordinates of points
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.calculatePerimeter());
        System.out.println("Longest Side: " + shape.getLongestSide());
        System.out.println("Average Side Length: " + shape.getAverageSide());
    }
}
