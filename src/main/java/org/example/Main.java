package org.example;
import java.util.Objects;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome! \n" +
                "Press 1 for addition\n" +
                "Press 2 for subtraction\n" +
                "Press 3 for multiplication\n" +
                "Press 4 for division\n");
        Scanner scanner = new Scanner(System.in);
        int op = scanner.nextInt();

        System.out.print("Enter the first number:\n");
        double a = scanner.nextFloat();

        System.out.print("Enter the second number:\n");
        double b = scanner.nextFloat();

        double out = 0;
        if(op == 1){
            out = addition(a,b);
        }
        if(op == 2){
            out = subtraction(a,b);
        }
        if(op == 3){
            out = multiplication(a,b);
        }
        if(op == 4){
            out = division(a,b);
        }

        System.out.print(out);

    }

    public static double addition(double a, double b){
        return a+b;
    }
    public static double subtraction(double a, double b){
        return a-b;
    }
    public static double multiplication(double a, double b){
        return a*b;
    }
    public static double division(double a, double b){
        return a/b;
    }
}