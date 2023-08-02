package org.example.formatting;

public class StringBuild {
    {
        System.out.println("""
            \u2022 string is immutable, so its value can not be changed.
            \u2022 stringBuilder is a mutable string type.
            \u2022 It will not create a new modified instance of the current string
              object but do the modifications in the existing string object.
        """);
    }
    {
        System.out.println("""
                \u2022 Ways to instantiate 'String'
                    \u2022 'String java = "java"'
                    \u2022 'String java = "Java" + "Programming"'
                    \u2022 'String java = new String("Java")'
                    """);
    }
    {
        System.out.println("""
                \u2022 Ways to instantiate 'StringBuilder'
                    \u2022 'StringBuilder java = new StringBuilder("java") -> Pass a String'
                    \u2022 'StringBuilder emptyBuilder = new StringBuilder() -> Pass no arguments at all.'
                    \u2022 'StringBuilder java = new StringBuilder(<capacity>5) -> Pass an integer value'
                    \u2022 'StringBuilder java = new StringBuilder(java) -> Pass some other type of character
                      sequence(StringBuilder)'
                    """);
    }
    public void string_stringBuilder(){
        String str = "Hello" + "World";
        System.out.println("String text print: " + str);
        System.out.println("String text length: " + str.length());

        // Below commented ways are not possible to instantiate StringBuilder
        // StringBuilder strBuilder = "Hello" + "World";
        // StringBuilder strBuilder = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Hello" + "World");
        System.out.println("\nStringBuilder text print: " + stringBuilder);
        System.out.println("StringBuilder text length: " + stringBuilder.length());

        System.out.println("""
                \n\u0023 Memory allocation for String:
                  For Example: "Hello" + " World" = "Hello World"
                  \u2022 String "Hello", "World" and "Hello World" is stored in different heap memory.
                  \u2022 Each should have its own variable.
                
                \u0023 Memory allocation for String Builder:
                  \u2022 String Builder will have one memory location and it will pick value from that location
                    whatever manipulation method from builder class we use it will update the same location
                  
                \u0023 Some important method from string builder class:
                  \u2022 Append - To append a string with other string->
                    (value) where value can be Char, boolean, int, float, double
                  \u2022 Insert - To insert a string at specific offset position ->
                    (offset, value) where value can be int, char, double, boolean
                  \u2022 Replace - Replace a string from specific startIndex to endIndex ->
                    (startIndex, endIndex, str)
                  \u2022 Capacity - Tells us about the memory reserved ->
                    (value) where value is int.
                  \u2022 delete/deleteCharAt - used to delete a sub string using index
                    or a single character
                  \u2022 reverse - To reverse a string
                  \u2022 setLength - To get the sub string based on index
                """);


        // Insert
        StringBuilder stringBuilder0 = new StringBuilder("Hello World");
        System.out.println("Insert in string builder: "+stringBuilder0.insert(5, " to java"));

        //Replace
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("\nJava is a programming Language");
        System.out.println("Replacing a sub string: " + stringBuilder2.replace(0,4, "Python "));
        System.out.println("Replacing a character: " + stringBuilder2.replace(26, 27,"l"));

        // Capacity is dynamic it varies with size for string builder
        System.out.println("\nString text capacity: " + stringBuilder.capacity());
        StringBuilder stringBuilder1 = new StringBuilder(32);
        System.out.println("Capacity of stringBuilder1 variable is: " + stringBuilder1.capacity());
        stringBuilder1.append("R".repeat(33));
        System.out.println("Capacity of stringBuilder1 variable after append: " + stringBuilder1.capacity());

        // Delete/DeleteCharAt
        System.out.println("\nDeleting a sub string: "+stringBuilder0.delete(5,12));
        System.out.println("Delete character using index: "+stringBuilder0.deleteCharAt(5));

        //Reverse a string
        System.out.println("\nReversing a string: " + stringBuilder0.reverse());

        // setLength of a string
        stringBuilder0.reverse().setLength(5);
        System.out.println("\nSub string: " + stringBuilder0);
    }
}
