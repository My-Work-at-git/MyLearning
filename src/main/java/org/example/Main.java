package org.example;

public class Main {
    public static void main(String[] args) {
        String bulletPoint = """
    I am block one:
        \u2022 I am tapped
        \u2022 I am tapped twiced
    """;
        System.out.println(bulletPoint);
    }
}
//git checkout master
//git branch main master -f
//git checkout main
//git push origin main -f