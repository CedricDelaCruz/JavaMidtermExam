// Encapsulation: Hiding data and showing only necessary information
class Rectangle {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Abstraction: Showing only necessary information
    public void displayInfo() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

// Interface: Defining a contract
interface Shape {
    double getArea();
    double getPerimeter();
}

// Implementing the interface
class RectangleImpl extends Rectangle implements Shape {
    public RectangleImpl(double width, double height) {
        super(width, height);
    }

    // Implementing the interface methods
    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }
}
