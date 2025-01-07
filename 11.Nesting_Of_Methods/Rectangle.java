public class Rectangle {
    private final double length;
    private final double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Outer method to display area and perimeter
    public void displayCalculations() {
        System.out.println("Rectangle Dimensions: Length = " + length + ", Width = " + width);

        // Nested method calls
        calculateAndPrintArea();
        calculateAndPrintPerimeter();
    }

    // Inner method to calculate and print the area
    private void calculateAndPrintArea() {
        double area = length * width; // Area calculation
        System.out.println("Area of Rectangle: " + area);
    }

    // Inner method to calculate and print the perimeter
    private void calculateAndPrintPerimeter() {
        double perimeter = 2 * (length + width); // Perimeter calculation
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    // Main method
    public static void main(String[] args) {
        // Create a rectangle object
        Rectangle rect = new Rectangle(5, 3);

        // Call the outer method to display calculations
        rect.displayCalculations();
    }
}
