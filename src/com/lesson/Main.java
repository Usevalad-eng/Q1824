package com.lesson;

public class Main {
    public static void main(String[] args) {
        String a = "green";
        String b = "blue";
        String c = "yellow";
        String d = "red";
        String k = "red";

        if (k.equals(b) || k.equals(a)) {
            System.out.println("box A");

        }
        else if (k.equals(c) || k.equals(d)) {

            System.out.println("box B");
        }
        else {
            System.out.println("box C");
        }
    }
}
