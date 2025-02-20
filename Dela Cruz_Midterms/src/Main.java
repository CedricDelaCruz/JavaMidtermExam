import java.util.Scanner;

public class Main {
    public static void main(String[] args) {	
    	
    	Scanner input = new Scanner(System.in);
    	boolean notActive;
    	
    	System.out.println("Welcome to the program!");
    	
    	do {
    		notActive = false;
    		System.out.println("1. Person ");
    		System.out.println("2. Dog ");
    		System.out.println("3. Rectangle ");
    		System.out.println("4. Exit");
    		System.out.print("Enter your choice: ");
    	
    		int choice = input.nextInt();
    	
    		switch (choice) {
    		case 1:
    			// Creates an instance of the class Employee
    			Employee employee = new Employee("Mika", 22, "Waiter");
    			employee.displayEmployeeInfo();
            
    			Employee employee2 = new Employee("Azalea", 21, "Janitor");
    			employee2.displayEmployeeInfo();
            
    			Employee employee3 = new Employee("Shellie", 20, "Marketer");
    			employee3.displayEmployeeInfo();
            
    			Employee employee4 = new Employee("Monty", 18, "Singer");
    			employee4.displayEmployeeInfo();
            
    			Employee employee5 = new Employee("AJ", 25, "Writer");
    			employee5.displayEmployeeInfo();
    			
    			notActive = true;
            
    			break;
    		case 2:
    			// Create an instance of the Dog class
    			Dog dog = new Dog("Cookie", "Shih Tzu");
    			dog.displayInfo();
    			dog.displayInfo("Azalea");
    			System.out.println(dog.toString());
    			
    			notActive = true;
            
    			break;
    		case 3:
    			// Create an instance of the RectangleImpl class
    			RectangleImpl rectangle = new RectangleImpl(4.0, 12.0);
    			rectangle.displayInfo();
    			System.out.println("Area: " + rectangle.getArea());
    			System.out.println("Perimeter: " + rectangle.getPerimeter());
    			
    			notActive = true;
            
    			break;
    			
    		case 4: // Exit case
    			System.out.println("Exiting the program. Goodbye!");
    			return; // Exit the program
    		default:
    			System.out.println("Invalid choice.");
    			notActive = true;
    			}
    		} while (notActive);
        
      input.close();
      
    }
}