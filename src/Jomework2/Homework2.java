package Homework2;

import java.util.Scanner;

5public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите любое положительное число до 2; 147; 483; 647;");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        for (int b = a ;b > 0;b = b / 10) {
            if ((b % 10 % 2 == 0)) {
                System.out.println("FizzBuzz");
            } else if (b % 10 % 2 == 0) {
                System.out.println("Fizz");
            } else if (b % 10 % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(b % 10);
                System.out.println("");
            }
        }
    }
}

