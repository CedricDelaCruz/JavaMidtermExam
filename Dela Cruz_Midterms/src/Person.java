

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstraction: Showing only necessary information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Inheritance: Creating a subclass
class Employee extends Person {
    private String department;

    // Constructor
    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Getter method
    public String getDepartment() {
        return department;
    }

    // Abstraction: Showing only necessary information
    public void displayEmployeeInfo() {
        displayInfo();
        System.out.println("Department: " + department + "\n");
    }
}


