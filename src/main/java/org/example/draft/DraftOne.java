package org.example.draft;

/**
 * @Program: javaweb
 * @ClassName DraftOne
 * @Description: draft for practice
 * @Author: JashoVan
 * @Create: 2024-06-25 17:00
 * @Version 1.0
 */
public class DraftOne {
    public static void main(String[] args) {
        double[] numbers = new double[3];
        numbers[0] = 1.9;
        numbers[1] = 1.8;
        numbers[2] = 1.7;
        double a = numbers[0] - numbers[1];
        double b = numbers[1] - numbers[2];
        System.out.println(a);
        System.out.println(b);
        System.out.println(a == b);
    }
}
