package inheritance.pitfalls;

// Base class: a generic dish
class Dish {
    public void cook() {
        System.out.println("Class Dish: cook() method");
        System.out.println("Following the standard recipe.");
        addSpices();
        System.out.println("Dish is ready!");
    }

    public void addSpices() {
        System.out.println("Adding salt.");
    }
}
