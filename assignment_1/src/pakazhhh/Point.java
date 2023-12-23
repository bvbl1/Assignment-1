package pakazhhh;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    /*Calculating the distance between first and second points
    * using this formula ((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))*/
    public double distanceTo(Point dest) {
        double x1 = this.x;
        double y1 = this.y;
        double x2 = dest.getX();
        double y2 = dest.getY();
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

    @Override
    public String toString() {   //string representation of points
        return x + " " + y;
    }
}