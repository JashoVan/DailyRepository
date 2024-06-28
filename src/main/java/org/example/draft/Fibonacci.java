package org.example.draft;

/**
 * @Program: javaweb
 * @ClassName Fibonacci
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-27 16:20
 * @Version 1.0
 */
public class Fibonacci {
    public static void main(String[] args) {
        long fibonacci = new Fibonacci().fibonacci(39);
        System.out.println(fibonacci);
    }

    private long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
