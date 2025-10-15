public class TestRectangle {
   public static void main(String[] args) {
      // Test Rectangle 1
      Rectangle rectangle1 = new Rectangle(4, 40);
      System.out.println("Rectangle s: ");
      System.out.printf("Width: %.1fcm\n", rectangle1.width);
      System.out.printf("Height: %.1fcm\n", rectangle1.height);
      System.out.printf("Area: %.1fcm2\n", rectangle1.getArea());
      System.out.printf("Perimter: %.1fcm\n", rectangle1.getPerimeter());
      System.out.println("\nRectangle 2: ");

      // Test Rectangle 2
      Rectangle rectangle2 = new Rectangle(3., 35.9);
      System.out.printf("Width: %.1fcm\n", rectangle2.width);
      System.out.printf("Height: %.1fcm\n", rectangle2.height);
      System.out.printf("Area: %.1fcm2\n", rectangle2.getArea());
      System.out.printf("Perimeter: %.1fcm\n ", rectangle2.getPerimeter());
   }
}
