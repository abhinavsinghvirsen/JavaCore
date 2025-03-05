package com.education.note.Cloning;

import java.util.Arrays;

public class JavaStringSort {
    public static void main(String[] args) {
        String[] names = new String[]{"Alphaa", "Gama", "Kiazo"};
        Arrays.stream(names).sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
    }
}
