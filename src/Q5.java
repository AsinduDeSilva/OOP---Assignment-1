import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of inner circle (cm) : ");
        double ri = scanner.nextDouble();
        System.out.print("Enter radius of outer circle (cm) : ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        System.out.println("Area of a circular region : " + (outerCircle.computeArea() - innerCircle.computeArea()) + " cm\u00B2");
    }
}

class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double computeArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double computeCircumference(){
        return 2 * Math.PI * radius;
    }
}
