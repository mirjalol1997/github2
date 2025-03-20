package AmaliyOverriding;

 class Triangle extends GeometricFigure{
     private int sideC;

     public Triangle(int sideA, int sideB, int sideC) {
         super(sideA, sideB);
         this.sideC = sideC;
     }

     public int getSideC(){
         return sideC;
     }
     public double area(){
         double p = (sideA + sideB + sideC) / 2.0;
         return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
     }

     public double perimetr() {
         return sideA + sideB + sideC;
     }

     public void info() {
         System.out.println("Triangle Area = " + area());
         System.out.println("Triangle Perimetr = " + perimetr());
     }

     public static void main(String[] args) {
         Triangle triangle = new Triangle(4,5,7);
         triangle.info();
     }

 }

