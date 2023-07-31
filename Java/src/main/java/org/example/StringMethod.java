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
        System.out.println("This will return index value for the character or string we provide");
        String str = "Hello world";
        System.out.printf("Index value for 'r' in 'Hello World': %d%n", str.indexOf('r'));
        System.out.printf("Index value for String 'world' in 'Hello world': %d%n", str.indexOf("world"));
        System.out.printf("Index value for last 'l' in 'Hello world': %d%n", str.lastIndexOf('l'));
        System.out.println("How to print second 'l' in 'Hello world'?");
        System.out.println("indexOf or lastIndexOf function take another argument which tells \n" +
                "from where to start counting or up to where we have to count respectively");
        System.out.printf("Using indexOf to find index value of second 'l' " +
                "in 'Hello world: %d%n", str.indexOf('l',3));
        System.out.printf("Using lastIndexOf to find index value of second 'l' " +
                "in 'Hello world': %d%n", str.lastIndexOf('l',8));


        System.out.println("\nString Inspection Method IV: isEmpty()");
        System.out.println("If a string is empty, length = 0, charAt(0) will " +
                "\nthrow error 'java.lang.StringIndexOutOfBoundsException: Index 0 out of bounds for length 0'");
        String empty = "";
        System.out.printf("Length of the string = %d",empty.length());
//        System.out.printf("\nCharacter at index 0 = %c",empty.charAt(0));


        System.out.println("\n\nString Inspection Method V: isBlank()");
        System.out.println("If a string is blank/whiteSpace, length = no. of whiteSpaces, charAt(indexWithInBound) = whiteSpace");
        String blank = "\t  \n";
        System.out.printf("Length of the string = %d",blank.length());
        System.out.printf("\nCharacter at index 0 = %c",blank.charAt(0));
        System.out.printf("\nCharacter at index 0 = %c",blank.charAt(blank.length()-1));
    }

    public void stringComparisonMethod() {
        System.out.println("""
                \nComparison methods includes:
                    \u2022 contentEquals: Return a boolean if argument passed is equal.
                      It allows arguments other than String, for any type that is character sequence.
                    \u2022 equals: Return a boolean if argument passed is equal to the String.
                    \u2022 equalsIgnoreCase: Return a boolean if argument passed is equal to
                      the String ignoring the case.
                    \u2022 contains: Return a boolean if String contains the argument passed.
                    \u2022 endsWith or startsWith: Return a boolean and much like contains method with more
                      focus on placement of the argument in the string.
                    \u2022 regionMatches: Returns a boolean, if defined sub-regions are matched
                    \u2022 Comparator and matches covered in sorting of regular expressions""");


        String str = "Java is a programming language";
        System.out.println("\nString Comparison Method: contentEquals (Its more useful in string builder)");
        boolean condition = str.contentEquals("Java is a programming language") ? true : false;
        if (condition) {
            System.out.println("String matches with argument");
        } else System.out.println("String doesn't matches with argument");


        System.out.println("\nString Comparison Method: equals");
        boolean condition1 = str.equals("Java is a programming language") ? true : false;
        if (condition1) {
            System.out.println("String matches with argument");
        } else System.out.println("String doesn't matches with argument");


        System.out.println("\nString Comparison Method: equalsIgnoreCase");
        String stringIgnore = str.toLowerCase();
        boolean condition2 = str.equalsIgnoreCase(stringIgnore) ? true : false;
        if (condition2) {
            System.out.println("String matches with argument ignoring case.");
        } else System.out.println("String doesn't matches with argument");


        System.out.println("\nString Comparison Method: contains");
        boolean condition3 = str.contains("Java") ? true : false;
        if (condition3) {
            System.out.println("String contains argument.");
        } else System.out.println("String doesn't contains argument");


        System.out.println("\nString Comparison Method: startsWith");
        boolean condition4 = str.startsWith("Java") ? true : false;
        if (condition4) {
            System.out.println("String starts with argument.");
        } else System.out.println("String doesn't starts with argument");


        System.out.println("\nString Comparison Method: endsWith");
        boolean condition5 = str.endsWith("language") ? true : false;
        if (condition5) {
            System.out.println("String ends with argument.");
        } else System.out.println("String doesn't ends with argument");


        System.out.println("\nString Comparison Method: regionMatches");
        System.out.println("Arguments -> ignoreCase(boolean), toffset(Start index), other(comparing string)," +
                "\n offset(Start offset of comparing string), len(Length of string)");
        String str1 = "AI uses java programming";
        boolean condition6 = str.regionMatches(true, 10, str1, 13, 11) ? true : false;
        if (condition6) {
            System.out.println("String region matches with argument");
        } else System.out.println("String region doesn't matches with argument");
    }

    public void stringManipulationMethod() {
        System.out.println("""
                \nManipulation methods includes:
                    \u2022 indent: Adds or removes spaces from the beginning of lines in multi-line text.
                    \u2022 strip/stripLeading/stripTrailing/trim: Removes whitespace.
                    \u2022 toUpperCase or toLowerCase
                    \u2022 concat: It concatenates text to the String and return a new string.
                    \u2022 join: Allows multiple strings to be concatenated together in a single method.
                    \u2022 repeat: Returns a string repeated by the no. of times specified in the arg.
                    \u2022 replace/replaceAll/replaceFirst: Replaces character or String in a string, returning
                      a new String with replacement made.
                    \u2022 substring/subsequence: These return a part of the String, its range defined by the
                      start and end index specified.
        """);


        System.out.println("String manipulation: indent");
        System.out.println("Adding spaces to the text.");
        System.out.print("Binesh".indent(4));
        System.out.println("Removing spaces to the text.");
        System.out.println("    Binesh".indent(-2));


        System.out.println("String manipulation: strip/stripLeading/stripTrailing/trim");
        String str0 = "   Java is fun    ";
        System.out.println("Before trimming or stripping: ");
        System.out.println("Using strip: "+str0.strip());
        System.out.println("Using stripLeading: "+str0.stripLeading());
        System.out.println("Using stripTrailing: "+str0.stripTrailing());
        System.out.println("Using trim: "+str0.trim());
        System.out.println("Trim remove character space below u+0020 and don't recognize unicode space above that like u2005");
        String str12 = "webspparrow.org \u2005";  // Unicode of white-space
        System.out.println("Print text with white-space unicode: '"+str12+"'");
        System.out.println("Print text with white-space unicode after trimming: '"+str12.trim()+"'");
        System.out.println("Print text with white-space unicode after stripping: '"+str12.strip()+"'");
        String str11 = " websparrow.org ";
        System.out.println("Text with starting and trailing white-space: '"+str11+"'");
        System.out.println(str11.trim().equals(str11.strip())); // return --> true
        System.out.println("Text with trailing white-space and unicode space: '"+str12+"'");
        System.out.println(str12.trim().equals(str12.strip())); // return --> false
        String str13 = "\t websparrow.org \r";
        // \r replaces text on right with the text on left
        System.out.print("Text with starting tab trailing white-space: '"+str13);
        System.out.println(str13.trim().equals(str13.strip())); // return --> true
        String str14 = "\u2000";
        System.out.println("Text with only unicode space: '"+str14+"'");
        System.out.println(str14.trim().equals(str14.strip())); // return --> false


        String str2 = "Hello World";
        System.out.println("String manipulation: toUpperCase and toLowerCase");
        System.out.printf("To upper case = %s", str2.toUpperCase());
        System.out.println("\nTo lower case = "+str2.toLowerCase());


        System.out.println("\nString manipulation: concat");
        System.out.println("There are three ways to concat: Method I");
        String str4 = "Java";
        str4 = str4.concat(" is");
        str4 = str4.concat(" a programming");
        str4 = str4.concat(" language.");
        System.out.println("String concat using method I: "+str4);

        System.out.println("There are three ways to concat: Method II");
        String str5 = "Java";
        str5 = str5.concat(" ").concat("is").concat(" ").
                concat("a").concat(" ").concat("programming").concat(" ").
                concat("language").concat(".");
        System.out.println("String concat using method II: " + str5);

        System.out.println("There are three ways to concat: Method III");
        String str6 = "Java";
                str6 = str6 + " " + "is" + " " + "a" + " " + "programming" + " "
                + "language" + ".";
        System.out.println("String concat using method III: " + str6);


        System.out.println("\nString manipulation: Join");
        String str7 = String.join(" ", "Java", "is", "a",
                "programming", "language");
        System.out.println("String manipulation using 'Join': "+str7);
        System.out.println("Birth data: "+String.join("/", "31",
                "08", "1997"));


        System.out.println("\nString manipulation: Repeat");
        String string = "Java ";
        System.out.println(string.repeat(10));
        System.out.println("-".repeat(50));
        System.out.print(string.repeat(10));


        System.out.println("\nString manipulation: Replace/ReplaceFirst/ReplaceAll");
        String str10 = "Java is a programming language";
        System.out.println("String replace method: "+str10.replace(' ', '/'));
        System.out.println("String replace method: "+str10.replace("Java", "Python"));
        System.out.println("String replace all method: "+str10.replaceAll(" ", "-"));
        System.out.println("String replace first method: "+str10.replaceFirst(" ", ": "));


        System.out.println("\nString manipulation: SubString");
        String str8 = "There are 8 planets in solar system";
        System.out.println("No.of planets in solar system: "+str8.substring(10, 11));
        int index = str8.indexOf('s', 19);
        System.out.println("SubString example: "+str8.substring(index).toUpperCase());
        String str9 = "31/08/1997";
        System.out.println("Birth day: "+str9.substring(0,2));
        System.out.println("Birth month: "+str9.substring(str9.indexOf('/') + 1, str9.lastIndexOf('/')));
        System.out.println("Birth year: "+str9.substring(str9.lastIndexOf('/') + 1));
        System.out.println("SubSequence example: " + str8.subSequence(23, str8.length()));

    }
}

