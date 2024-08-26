
public class Circle {

    private double radius = 1.0; 
    private String color = "red"; 


    public Circle() {
    }


    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {

        Circle circle1 = new Circle(5.0);
        System.out.println("Área do primeiro círculo: " + circle1.getArea());


        Circle circle2 = new Circle(7.0);
        System.out.println("Raio do segundo círculo: " + circle2.getRadius());
    }
}
