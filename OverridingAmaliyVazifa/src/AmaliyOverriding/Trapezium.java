package AmaliyOverriding;

class Trapezium extends GeometricFigure {
    private double high;

    public Trapezium(int sideA, int sideB, double high) {
        super(sideA, sideB);
        this.high = high;
    }

    public double getHigh(){
        return high;
    }

    public double area(){
        double p = (sideA + sideB) / 2.0;
        return p * high;
    }
    //sideD yon tomoni
    public double sideD() {
       return Math.sqrt(high * high + Math.pow((sideA - sideB) / 2, 2));
    }

    public double perimetr() {
        double d = sideD();
        return sideA + sideB + d * 2;
    }

    public void info() {
        System.out.println("Trapezium Area = " + area());
        System.out.println("Trapezium Perimetr = " + perimetr());
        System.out.println("d= " + sideD());
    }

    public static void main(String[] args) {
        Trapezium trapezium = new Trapezium(10,6,4);
        trapezium.info();
    }
}

