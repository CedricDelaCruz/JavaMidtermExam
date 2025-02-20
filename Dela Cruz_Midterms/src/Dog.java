// Encapsulation: Hiding data and showing only necessary information
class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Abstraction: Showing only necessary information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + "\n");
    }

    // Polymorphism: Method overloading
    public void displayInfo(String owner) {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Owner: " + owner + "\n");
    }

    // Polymorphism: Method overriding
    public String toString() {
        return "Name: " + name + ", Breed: " + breed + "\n";
    }
}