public class Circle extends Point{

protected double r;

//Constructor
   public Circle(){
      r=0;
   }

//Parameter Constructor
   public Circle(double rad){
      setRad(rad);
   }
   
//Sets the radius
   public void setRad(double rad){
      r=rad;
   }

//Returns radius, area and circumference
   public double getRad(){
      
      return r;
      
   }
   public double getArea(){
      
      double area = (Math.PI)*r*r;
      return area;
      
   }
   public double getCir(){
      
      double cir = 2*(Math.PI)*r;
      return cir;
      
   }

//Prints radius, area and circumference
   public void printStats(){
   System.out.println("This circle is centered at (" + x + ", " + y + ")");
   System.out.print("It has a radius of " + r + ", an area of ");
   System.out.format("%.1f", getArea());
   System.out.print(", and a circumference of ");
   System.out.format("%.1f", getCir());
   System.out.println(".");
   System.out.println();
   
   }
   
   public void printRad(){
   System.out.println("radius: " + r);
   }
   
   public void printArea(){
   System.out.print("area: ");
   System.out.format("%.1f", getArea());
   System.out.println(".");
   }

   public void printCir(){
   System.out.print("circumference: ");
   System.out.format("%.1f", getCir());
   System.out.println(".");
   }

}