package org.example;

public class StringMethod {
    {
        System.out.println("""
                \u2022 The String has over 60 methods available
                \u2022 The String is a sequence of characters, meaning its characters are
                  ordered and indexed
                \u2022 The index starts at 0, and not 1
                \u2022 If string length is 11, then index will be 10.
                \u2022 String methods can be split in to three categories:
                        \u2022 String Inspection Method: Information about the String like length, empty etc.
                        \u2022 Methods to compare String values: Like equal or not
                        \u2022 String manipulation methods: Transform string value to other""");
    }
    public void stringInspectionMethod(){
        System.out.println("""
                \nInspection methods includes:
                    \u2022 Length: Return the no. of character in the string.
                    \u2022 charAt: Return the character at the index that's passed.
                    \u2022 indexOf/lastIndexOf: Returns the index for the character provided
                    \u2022 isEmpty: Return 'true' if length is zero.
                    \u2022 isBlank: Return 'true' if length is zero OR the string only contains whitespace characters.""");

        String string = "Java is a programming language";

        // Use of %s: to print string
        System.out.println("\nTo print a string use %s");
        System.out.printf("For Example: %s%n", string);

        System.out.println("\nString Inspection Method I: Length");
        int length = string.length();
        System.out.printf(
                "Number of characters in \""+string+"\" : %d", length);

        // Use of %c: to print single character
        System.out.println("\n\nTo print a character use %c");
        System.out.printf("For Example: %c%n", 'A');

        System.out.println("\nString Inspection Method II: charAt");
        System.out.printf(
                "Characters at 15th position for the string " +
                        "\""+string+"\" : %c", string.charAt(15));
        System.out.printf(
                "\nCharacters at 15th position from behind the string " +
                        "\""+string+"\" : %c", string.charAt(string.length()-15));

        System.out.println("\n\nString Inspection Method III: indexOf()/lastIndexOf()");


        System.out.println("If a string is empty, length = 0, charAt(0) will " +
                "\nthrow error 'java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0'");
        String empty = "";
        System.out.printf("Length of the string = %d",empty.length());
//        System.out.printf("\nCharacter at index 0 = %c",empty.charAt(0));

        System.out.println("\n\nString Inspection Method IV: isEmpty()");
        System.out.println("If a string is empty, length = 0, charAt(0) will " +
                "\nthrow error 'java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0'");
        System.out.printf("Length of the string = %d",empty.length());
//        System.out.printf("\nCharacter at index 0 = %c",empty.charAt(0));

        System.out.println("\n\nString Inspection Method V: isBlank()");
        System.out.println("If a string is blank/whiteSpace, length = no. of whiteSpaces, charAt(indexWithInBound) = whiteSpace");
        String blank = "\t  \n";
        System.out.printf("Length of the string = %d",blank.length());
        System.out.printf("\nCharacter at index 0 = %c",blank.charAt(0));
        System.out.printf("\nCharacter at index 0 = %c",blank.charAt(blank.length()-1));
    }

}

