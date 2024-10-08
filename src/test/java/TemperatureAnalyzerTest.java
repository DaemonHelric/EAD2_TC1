import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TemperatureAnalyzer.TemperatureAnalyzer;

public class TemperatureAnalyzerTest {
    @Test
    void testValidInputAverageAbove() {
        int[] temperatures = {2, 2, 2, 2, 2, 2, 3};
        assertEquals(1, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }

    @Test
    void testValidInputMultipleDaysAboveAverage() {
        int[] temperatures = {21, 10, 13, 34, 30, 21, 34};
        assertEquals(3, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }

    @Test
    void testValidInputAlmostAllAboveAverage() {
        int[] temperatures = {2, 2, 2, 2, 2, 2, 1};
        assertEquals(6, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }

    @Test
    void testAllTemperaturesEqual() {
        int[] temperatures = {10, 10, 10, 10, 10, 10, 10};
        assertEquals(0, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }

    @Test
    void testInputWithNegativeValues() {
        int[] temperatures = {5, -2, 4, 3, 7, -1, 0};
        assertEquals(4, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }

    @Test
    void testErrorWithInvalidTemperatureTooHigh() {
        int[] temperatures = {21, 10, 13, 100, 30, 21, 34}; // Invalid value
        assertEquals("Erro", TemperatureAnalyzer.validateAndCount(temperatures));
    }

    @Test
    void testErrorWithInvalidTemperatureTooLow() {
        int[] temperatures = {21, 10, -300, 34, 30, 21, 34}; // Invalid value
        assertEquals("Erro", TemperatureAnalyzer.validateAndCount(temperatures));
    }

    @Test
    void testErrorWithInvalidArraySize() {
        int[] temperatures = {21, 10, 13, 34, 30, 21}; // Less than 7 elements
        assertEquals("Erro", TemperatureAnalyzer.validateAndCount(temperatures));
    }
}
