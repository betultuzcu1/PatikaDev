package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("1-100 arasindaki asal sayilar:");

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}