class Rectangle {
   double width;
   double height;

   Rectangle() { // constuctor with no argument
      width = 2;
      height = 1;
   }

   Rectangle(double newWidth, double newHeight) { // constuctor with argument
      width = newWidth;
      height = newHeight;
   }

   double getArea() { // method to calculate area
      return width * height;
   }

   double getPerimeter() { // method to calculate perimeter
      return 2 * (width + height);
   }

}