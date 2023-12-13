public class Circle {
    private double radius;
    private String color;

    protected Circle() {
        radius=1;
        color="red";
    }
   protected Circle(double radius) {
        this.radius = radius;
   }

    protected double getRadius() {
        return radius;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected double getArea() {
        return radius*radius*Math.PI;
   }
}
