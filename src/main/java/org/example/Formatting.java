package org.example;

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
}
