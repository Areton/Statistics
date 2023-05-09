package ru.netology;

public class StatisticsService {
    public long calcIncome(long[] incomes) {
        long allIncomes = 0;
        for (int i = 0; i < incomes.length; i++) {
            allIncomes = allIncomes + incomes[i];
        }
        return allIncomes;
    }

    public long calcAvgIncome(long[] incomes) {
        long allIncomes = calcIncome(incomes);
        long avgIncome = allIncomes / incomes.length;
        return avgIncome;
    }

    public int getMinMonth(long[] incomes) {
        int minMonth = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] <= incomes[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int getMaxMonth(long[] incomes) {
        int maxMonth = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] >= incomes[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int monthsLessAvg(long[] incomes) {
        long avgIncome = calcAvgIncome(incomes);

        int countLess = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] < avgIncome) {
                countLess = countLess + 1;
            }
        }
        return countLess;
    }

    public int monthsAboveAvg(long[] incomes) {
        long avgIncome = calcAvgIncome(incomes);

        int countAbove = 0;
        for (int i = 0; i < incomes.length; i++) {
            if (incomes[i] > avgIncome) {
                countAbove = countAbove + 1;
            }
        }
        return countAbove;
    }
}
