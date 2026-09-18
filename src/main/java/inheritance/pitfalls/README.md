# Inheritance Pitfalls

This exercise demonstrates how inheritance and method overriding can sometimes produce behavior that is not obvious from reading the subclass alone.

Read the `Dish`, `SpicyDish`, and `CookingDemo` classes before running the program.

## 1. Predict the output

Consider the following code:

```java
Dish dish = new SpicyDish();
dish.cook();
```

Before running the program, predict the exact output.

In particular, pay attention to which version of `addSpices()` is executed.

## 2. Run the program

Run `CookingDemo` and compare the output with your prediction.

Notice that `SpicyDish.cook()` calls:

```java
super.cook();
```

but does not directly call `addSpices()`.

Why does `SpicyDish.addSpices()` still execute?

## 3. Trace the method calls

Write the sequence of method calls that occurs when:

```java
dish.cook();
```

is executed. Show the class that each method belongs to.

## 4. Experiment

Temporarily remove the `addSpices()` method from `SpicyDish`.

Run the program again.

* What changes?
* Which version of `addSpices()` is now called?
* Why?

Restore the method when you are finished.

## 5. Think about the design

Suppose the author of `Dish.cook()` intended the standard recipe to always use the `Dish` version of `addSpices()`.

* Why does the current design not guarantee that?
* How could you modify the design so that subclasses cannot replace this part of the standard recipe?

## 6. Redesign using composition

Another approach is to use **composition** instead.

Redesign the example so that `Dish` does not rely on subclasses overriding `addSpices()`.

Create a separate object responsible for adding spices. For example, you may use:

```java
interface SpiceAdder {
    void addSpices();
}
```

Create at least two implementations:

* one that adds the standard spices
* one that adds the standard spices plus chili powder

Modify `Dish` so that it has a `SpiceAdder` and calls it from `cook()`.

Your code should allow you to create dishes such as:

```java
Dish regularDish = new Dish(new StandardSpices());
Dish spicyDish = new Dish(new SpicySpices());
```

Then answer:

* How is this design different from using `SpicyDish extends Dish`?
* Why does this design avoid the original problem where `Dish.cook()` unexpectedly executes an overridden subclass method?
* What behavior can now be changed without creating another subclass of `Dish`?

