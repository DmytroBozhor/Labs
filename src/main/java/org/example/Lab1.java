package org.example;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result = 0.0;

        while (true) {
            String userMessage = scanner.nextLine();
            String[] dividedMessage = userMessage.trim().split(" ");
            if (userMessage.equals("exit")) {
                break;
            }
            if (dividedMessage.length == 3) {
                try {
                    double a = Double.parseDouble(dividedMessage[0]);
                    String operation = dividedMessage[1];
                    double b = Double.parseDouble(dividedMessage[2]);
                    result = doOperationOnNumbers(a, b, operation);
                    System.out.println(result);
                } catch (NumberFormatException e) {
                    System.out.println("Numbers were not recognized");
                    break;
                }
            } else if (dividedMessage.length == 2) {
                try {
                    String operation = dividedMessage[0];
                    double b = Double.parseDouble(dividedMessage[1]);
                    result = doOperationOnNumbers(result, b, operation);
                    System.out.println(result);
                } catch (NumberFormatException e) {
                    System.out.println("Numbers were not recognized");
                    break;
                }
            } else {
                throw new RuntimeException("Not required format");
            }
        }
        scanner.close();
    }

    public static double doOperationOnNumbers(double a, double b, String operation) {
        return switch (operation) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            case "^" -> Math.pow(a, b);
            default -> throw new RuntimeException("Operation is not valid");
        };
    }
}