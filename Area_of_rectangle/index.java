import java.util.*;

public class index {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter the area of length : ");

      double length = scn.nextDouble();
      System.out.println("Enter the area of breadth :");

      double breadth = scn.nextDouble();

      double area = length * breadth;
      System.out.println("Enter the area if rectangle is : "+ area);

      double perimeter = 2 * (length + breadth);
      System.out.println("Enter the perimeter of rectangle : "+ perimeter);

    }
    
}
