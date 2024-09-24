package TemperatureAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as 7 temperaturas separadas por espaço:");

        String input = scanner.nextLine();
        String[] tempStrings = input.split(" ");

        if (tempStrings.length != 7) {
            System.out.println("Erro");
            return;
        }

        try {
            int[] temperatures = new int[7];
            for (int i = 0; i < 7; i++) {
                temperatures[i] = Integer.parseInt(tempStrings[i]);
            }

            Object result = TemperatureAnalyzer.validateAndCount(temperatures);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Erro");
        }
    }
}