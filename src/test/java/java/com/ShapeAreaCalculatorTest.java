import java.util.Scanner;

public class ShapeAreaCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPlease select a shape to calculate the area: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangle");
            System.out.println("4. Circle");
            System.out.println("5. Quit");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter length and width of rectangle: ");
                    double length = input.nextDouble();
                    double width = input.nextDouble();
                    double rectangleArea = length * width;
                    System.out.println("Area of rectangle is: " + rectangleArea);
                    break;
                case 2:
                    System.out.println("Enter side length of square: ");
                    double side = input.nextDouble();
                    double squareArea = side * side;
                    System.out.println("Area of square is: " + squareArea);
                    break;
                case 3:
                    System.out.println("Enter base and height of triangle: ");
                    double base = input.nextDouble();
                    double height = input.nextDouble();
                    double triangleArea = 0.5 * base * height;
                    System.out.println("Area of triangle is: " + triangleArea);
                    break;
                case 4:
                    System.out.println("Enter radius of circle: ");
                    double radius = input.nextDouble();
                    double circleArea = Math.PI * radius * radius;
                    System.out.println("Area of circle is: " + circleArea);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 5);
    }
}
