package TemperatureAnalyzer;

public class TemperatureAnalyzer {
    public static Object validateAndCount(int[] temperatures) {
        if (temperatures.length != 7) {
            return "Erro";
        }

        for (int temperature : temperatures) {
            if (temperature < -273 || temperature > 50) {
                return "Erro";
            }
        }

        return countDaysAboveAverage(temperatures);
    }

    public static int countDaysAboveAverage(int[] temperatures) {
        double sum = 0;

        for (int temperature : temperatures) {
            sum += temperature;
        }

        double average = sum / temperatures.length;
        int countAboveAverage = 0;

        for (int temperature : temperatures) {
            if (temperature > average) {
                countAboveAverage++;
            }
        }

        return countAboveAverage;
    }
}