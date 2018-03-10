package com.mycompany.calculator331;

import java.util.Scanner;

/**
 * 
 *
 * @since Mar 9, 2018, 11:31:42 AM
 * @author Grzegorz Brodowski
 */
public class Main {
    public static void main(String[] args) {
        Long target;
        try (Scanner s = new Scanner(System.in)) {
            target = s.nextLong();
        }
        System.out.println(target);
    }
}