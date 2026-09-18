# Inheritance Exercise

In this exercise, you will practice inheritance and polymorphism using a hierarchy of `Creature`, `Human`, and `Alien` classes.

The `Creature` class is the parent class. `Human` is a completed subclass that you can use as an example. 
Your task is to complete the `Alien` class and the `Driver`.

## Part 1: Complete `Alien`

Modify `Alien` so that it is a subclass of `Creature`.

Complete its constructor so that it:

* initializes the inherited greeting
* initializes the alien's planet
* increments `numAliensFromMars` when an alien is from Mars

Override the `speak()` method so that an alien says:

```text
Alien from planet <planet> says: <greeting>
```

Complete the `fight()` method. If the alien is from Mars and there are at least 3 aliens from Mars, print:

```text
Let's fight!
```

## Part 2: Complete `Driver`

Create an `ArrayList` of `Creature` objects:

```java
List<Creature> creatures = new ArrayList<>();
```

1. Add **3 `Alien` objects** and **2 `Human` objects** to the list.

2. Iterate over the list and call `speak()` for every creature.

3. If the current creature is an `Alien`, also call its `fight()` method.

## Questions to Think About

As you work through the exercise, consider:

* Why can both `Human` and `Alien` objects be stored in a `List<Creature>`?
* When `speak()` is called using a `Creature` reference, how does Java determine which version of `speak()` to execute? Look up the term dynamic dispatch and explain how it applies here.
* Why can you call `speak()` directly on every element of the list, but not `fight()`?
* What does `static` mean for `numAliensFromMars`? Does each `Alien` have its own copy of this variable?
