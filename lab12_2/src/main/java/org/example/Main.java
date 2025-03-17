package org.example;

public class Main {
    public static void main(String[] args) {
        Tester.staticMethod();

        Tester a = new Tester("a", "b", 1, 2, 3.0);
        System.out.println();
        a.print("string");
        System.out.println();
        a.print(100);
        System.out.println();
        a.print(100.0);
    }
}