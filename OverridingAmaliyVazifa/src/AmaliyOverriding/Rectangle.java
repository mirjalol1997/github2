package AmaliyOverriding;

public class Rectangle extends GeometricFigure {

    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }
    public double area(){
        return sideA * sideB;
    }

    public double perimetr() {
        return (sideA + sideB) * 2;
    }

    public void info() {
        System.out.println("Rectangle Area = " + area());
        System.out.println("Rectangle Perimetr = " + perimetr());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(7,7);
        rectangle.info();
    }
}
