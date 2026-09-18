package inheritance.pitfalls;

class SpicyDish extends Dish {

    @Override
    public void cook() {
        System.out.println("Class SpicyDish: cook method");
        System.out.println("Adding black pepper");
        super.cook(); // now cook according to the standard recipe in the Dish class
        // Note that we do NOT call addSpices here
    }

    @Override
    public void addSpices() {
        System.out.println("Adding chili powder.");
    }
}
