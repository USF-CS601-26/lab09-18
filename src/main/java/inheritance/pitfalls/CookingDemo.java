package inheritance.pitfalls;

/* 1. Understand why both pepper and chili are added to the dish (and no salt)
   even though we do NOT call SpicyDish's addSpices() from SpicyDish's cook method.
   2. Draw the call sequence when cook() is called. Show which methods are executed and in what order.
   3. What happens if we remove addSpices() from SpicyDish but keep the override of cook()?
      What "spices" will we get?
   4. How can we fix the original code
 */
// Experiment with ways to fix this issue (with adding spices
public class CookingDemo {
    static void main(String[] args) {
        Dish dish = new SpicyDish();
        dish.cook();
        dish.addSpices();
        System.out.println("Why did we end up with no salt and twice the chili powder?");
    }
}
