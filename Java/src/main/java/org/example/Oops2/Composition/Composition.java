package org.example.Oops2.Composition;

public class Composition {
    {
        System.out.println("""
                    \u2022 Inheritance in java show Is-A relation
                    \u2022 Composition in java show has-A relation
                    \u2022 Inheritance is a way to reuse functionality and attributes.
                    \u2022 Composition is a way to make the combination of classes,
                        act like a single coherent object(example: PersonalComputer.java).
                  
                  
                \u0023 Use Composition or Inheritance
                  \u2022 While designing programs in java, you probably want to look at composition first.
                  \u2022 Composition is more flexible, we can add, remove and these changes are less likely
                    to have downstream effects.
                  \u2022 Inheritance is less flexible.
                  \u2022 Composition provides functional reuse outside of the class hierarchy, meaning classes
                    can share attributes & behavior, by having similar components, instead of inheriting
                    functionality from parent or base class.
                  \u2022 Adding a class to, or removing a class from, a class hierarchy, may impact all
                    subclasses from that point.
                  \u2022 Java's inheritance breaks encapsulation, beacuse subclasses may need direct access to
                    a parent's state or behavior.
                  \u2022 In inheritance a new subclass may not need all the functionality or attributes of its
                    parent class.""");
    }
}
