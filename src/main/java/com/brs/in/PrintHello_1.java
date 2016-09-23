package com.brs.in;

public class PrintHello_1 {
    public static void main(String[] args) {
        String suffix = "River";
        for (String riverName : args) {
            System.out.println(riverName + suffix);
        }
    }
}