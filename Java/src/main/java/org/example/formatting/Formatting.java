package org.example.formatting;

public class Formatting {
    public void escapeSequences(){
        String textBlock = "Print a set of bullet points: \n"+
                    "\t\u2022 Earth is 4 billion years old. \n"+
                    "\t\u2022 It takes 8 min for sun rays to reach Earth \n"+
                    "\t\u2022 Oh! You know if sun disappear suddenly people \n"+
                      "\t  on earth will feel that after 8 min which means \n"+
                      "\t  gravitation will remain for 8 min as well.\n";
        System.out.println(textBlock);
    }
    public void textBlock(){
        //Multi-line string literals, it's simple a String, JDK-15 and above
        String textBlock = """
                Print a set of bullet points:
                    \u2022 Earth is 4 billion years old.
                    \u2022 It takes 8 min for sun rays to reach Earth
                    \u2022 Oh! You know if sun disappear suddenly people
                      on earth will feel that after 8 min which means
                      gravitation will remain for 8 min as well
                           """;
        System.out.println(textBlock);
    }

    public void conversionNumber(){
        //For printing formatted data we have to use "printf"
        int wholeNumber = 35;
        float integer = 23.456f;
        double integer1 = 234.56543454;

        // %d
        System.out.println("For printing whole Number i.e. short, int and long we have to use %d");
        System.out.printf("For example: Whole number = %d%n", wholeNumber);

        // %n
        System.out.println("\nFor adding a line space we have to use %n");
        System.out.printf("For example: After this text, next text will be on a new line. %n");

        // %f
        System.out.println("\nFor printing decimal number i.e. double and float we have to use %f");
        System.out.printf("For Example: integer = %f%n", integer);

        // If we use %f to print whole number it will throw
        // "java.util.IllegalFormatConversionException: f != java.lang.Integer"
//        System.out.println("\nUsing incorrect conversion format for instance using " +
//                " %f to print whole number(%d)");
//        System.out.printf("For Example: integer = %f", wholeNumber);

        // Formatting with precision value
        // %[argument_index$][flags][width].[precision]
        System.out.println("\nFormatting decimal number up to 2 precision point we have use %.2f");
        System.out.printf("For Example: Integer with 2 precision point = %3.1f%n", integer1);

        // Formatting with width value, which specifics how many spaces are expected
        // %[argument_index$][flags][width].[precision]
        System.out.println("\nPrinting certain values without width to see alignment");
        for(int i = 1 ; i <= 100000 ; i*=10){
            System.out.printf("Printing value in sequence %d %n", i);
        }
        System.out.println("\nPrinting certain values with width to see alignment using %2d");
        for(int i = 1 ; i <= 100000 ; i*=10){
            System.out.printf("Printing value in sequence %6d %n", i);
        }
    }

    public void stringFormatting(){
        // Two method to format string using string class

        // 1. String formatString = String.format(arg);
        System.out.println("\nString formatting using 'String.format' method");
        int wholeNumber = 45;
        String formatString = String.format("Example of string format method %d", wholeNumber);
        System.out.println(formatString);

        // 2. String formatString = "String %d".format(integer); this is from JDK 15 onwards
        int integer = 45;
        System.out.println("\nString formatting using '(arg).format' method for JDK 15 and above");
        String formatStr = "Example of string format method %d".formatted(integer);
        System.out.println(formatStr);
    }
}
