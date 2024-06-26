import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test                    //// сумма всех продаж за все месяцы.
    public void sumSales() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам - 164
        int expected = 175;
        long actualMinSales = service.sumSales(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }

    @Test                        //// средняя сумма  продаж за  месяц.
    public void averageSales() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам - 164
        int expected = 14;
        long actualMinSales = service.averageSale(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }

    @Test                      //// месяц пика продаж.
    public void peakSales() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам - 164
        int expected = 8; // и 6 и 8 месяца пиковые.
        int actualMinSales = service.peakSales(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }


    @Test                       //// месяц минимального количества продаж.
    public void minSales() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам
        int expected = 1;
        int actualMinSales = service.minSales(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }

    @Test                          // количество месяцев, в которых продажи были ниже среднего
    public void belowTheAverage() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 3;
        int actualMinSales = service.belowTheAverage(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }

    @Test                       // количество месяцев, в которых продажи были выше среднего
    public void aboveAverage() {
        StatsService service = new StatsService();
        long[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам
        int expected = 7;
        int actualMinSales = service.aboveAverage(arrs);
        Assertions.assertEquals(expected, actualMinSales);

    }
}

/* **********************************************************************************
    @ParameterizedTest
        @CsvSource({
                "175, 14"
    })
    public void sumSales(int expected) {
        StatsService service = new StatsService();
        int[] arrs = {3, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18}; // количество продаж по месяцам - 164
        int actualMinSales = service.SumSales(arrs);
        Assertions.assertEquals(expected, actualMinSales);

        int actualMaxSales = service.AverageSale(arrs);
        Assertions.assertEquals(expected, actualMaxSales);
    }
}

 ******************************************************************************** */
