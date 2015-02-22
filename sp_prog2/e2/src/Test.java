
public class Test {
   public static void main(String[] args) {
       Circle c1 = new Circle(5, 7, 10);
       Circle c2 = new Circle(5, 3, 3);

       System.out.println("Radius: " + c1.getArea());
       System.out.println("Circle 1 and 2 are: "+ c1.equals(c2));
   }
}
