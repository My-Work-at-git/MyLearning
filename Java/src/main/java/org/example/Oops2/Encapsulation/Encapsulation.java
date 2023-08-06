package org.example.Oops2.Encapsulation;

public class Encapsulation {
    {
        System.out.println("""
                \u2022 Encapsulation means hiding things, by making them private, or inaccessible.
                \u2022 To make the interface simpler, we may want to hide unnecessary details.
                \u2022 To protect the integrity of data on an object, we may hide or restrict access
                  to some of the data and operations.
                \u2022 To decouple the published interface from the interval details of the class,
                  we may hide actual names and types of class members.
                \u2022 When we talk about a class's public or published interface, we're really
                  talking about the class members that are exposed to, or can be accessed by,
                  the calling code.
                \u2022 Everything else in the class is internal, or private to it.
                \u2022 An application programming interface, or API, is the public contract, that tells
                  others how to use the class.
                  
                \u0023 Limitation of public access modifiers:
                    \u2022 If attributes are accessed directly they might by pass checks, operations and other validation
                      for assigning values to attribute in the class.
                    \u2022 It encourages an interdependency, or coupling, between the calling code and the class.
                    \u2022 The calling code has to take the responsibility, for properly initializing a new Player
                      (Omitting constructor0).
                      
                \u0023 Benefits of using encapsulation:
                    \u2022 Protect members of the class and some methods from external access.
                    \u2022 This prevents calling code from bypassing the rules and constraints we've built into the class.
                    \u2022 We create a new instance, it's initialized with valid data.
                    \u2022 Making sure that there's no direct access to the field.""");
    }

}
