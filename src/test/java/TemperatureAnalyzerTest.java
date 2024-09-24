import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureAnalyzerTest {
    @Test
    void testValidInputAverageAbove() {
        int[] temperatures = {2, 2, 2, 2, 2, 2, 3};
        assertEquals(1, TemperatureAnalyzer.countDaysAboveAverage(temperatures));
    }
}
