package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.CsvFileSource;

public class StatisticsServiceTest {

    @Test
    public void shouldFindIncomesSum() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        long expectedSum = 180;
        long actualSum = service.calcIncome(incomes);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAvgIncome() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        long expectedSum = 15;
        long actualSum = service.calcAvgIncome(incomes);
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMonthMinIncome() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expectedMonth = 8;
        int actualMonth = service.getMinMonth(incomes);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthMaxIncome() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expectedMonth = 7;
        int actualMonth = service.getMaxMonth(incomes);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindMonthsLessAvg() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expectedMonths = 5;
        int actualMonths = service.monthsLessAvg(incomes);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }

    @Test
    public void shouldFindMonthsAboveAvg() {
        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();
        int expectedMonths = 5;
        int actualMonths = service.monthsAboveAvg(incomes);
        Assertions.assertEquals(expectedMonths, actualMonths);
    }
}
