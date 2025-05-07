class Circle {
    double radius = 1;
    /** Construct a circle object */
    Circle() {
    }
    /** Construct a circle object */
    Circle(double newRadius) {
        radius = newRadius;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * Math.PI;
    }
    /** Return the perimeter of this circle */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
    /** Set new radius for this circle */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

public class  TestCircle{
    public static void main(String [] args){
        Circle circle = new Circle();
        System.out.println("The area of the circle of radius " + circle.radius + " is " + circle.getArea());

        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}
