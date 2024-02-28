/*Write a Java program that defines a 'Point' class with attributes 'X' and 'Y', and includes a
parameterized constructor to initialize these attributes. Implement a copy constructor to
create a new point object with the same attribute values. Ensure that modifications made to one
object do not affect the other. Utilize getter and setter methods to retrieve and update the
attribute values.
 */

    class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point otherPoint) {
        this.x = otherPoint.getX();
        this.y = otherPoint.getY();
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}

public class A1Q3 {
    public static void main(String[] args) {
        Point point1 = new Point(3.0, 4.0);
        Point point2 = new Point(point1);
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
        point1.setX(5.0);
        point1.setY(6.0);
        System.out.println("\nAfter modification:");
        System.out.println("Point 1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point 2: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}
