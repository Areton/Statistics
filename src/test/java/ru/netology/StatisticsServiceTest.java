package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatisticsServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindIncomesSum(long incomes[]) {
        StatisticsService service = new StatisticsService();
        long expectedSum = 180;
        long actualSum = service.calcIncome(incomes);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindAvgIncome(long incomes[]) {
        StatisticsService service = new StatisticsService();
        long expectedSum = 15;
        long actualSum = service.calcAvgIncome(incomes);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindMonthMinIncome(long incomes[]) {
        StatisticsService service = new StatisticsService();
        int expectedMonth = 8;
        int actualMonth = service.getMinMonth(incomes);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindMonthMaxIncome(long[] incomes) {
        StatisticsService service = new StatisticsService();
        int expectedMonth = 7;
        int actualMonth = service.getMaxMonth(incomes);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindMonthsLessAvg(long incomes[]) {
        StatisticsService service = new StatisticsService();
        int expectedMonths = 5;
        int actualMonths = service.monthsLessAvg(incomes);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Incomes.csv")
    public void shouldFindMonthsAboveAvg(long incomes[]) {
        StatisticsService service = new StatisticsService();
        int expectedMonths = 5;
        int actualMonths = service.monthsAboveAvg(incomes);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
