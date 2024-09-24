import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
}
