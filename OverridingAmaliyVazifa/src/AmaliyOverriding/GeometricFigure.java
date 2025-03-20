package AmaliyOverriding;

  abstract class GeometricFigure {

       abstract double area();

       abstract double perimetr();

     int sideA;
     int sideB;

     public GeometricFigure(int sideA, int sideB) {
         this.sideA = sideA;
         this.sideB = sideB;
     }

      public GeometricFigure() {

      }

     public int getSideA(){
         return sideA;
     }
     public int getSideB(){
         return sideB;
     }
 }
