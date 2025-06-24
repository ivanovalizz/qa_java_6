package ru.netology.stats;

public class StatsService {

    public long yearSalesSum (long[] salesArray) { // Ищет сумму всех продаж за год
        long salesSum = 0;
        for (long sale : salesArray) {
            salesSum = salesSum + sale;
        }
        return salesSum;
    }

    public long averageYearSales (long[] salesArray) { // Ищет среднее значение продаж в месяц
        return yearSalesSum(salesArray) / 12;
    }

    public int maxSaleMonthNumber (long[] salesArray) { // Ищет месяц с максимальными продажами
        long maxSale = salesArray[0];
        int monthNumber = 0;
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] >= maxSale) {
                maxSale = salesArray[i];
                monthNumber = i;
            }
        }
        return monthNumber + 1;
    }

    public int minSaleMonthNumber (long[] salesArray) { // Ищет месяц с минимальными продажами
        long minSale = salesArray[0];
        int monthNumber = 0;
        for (int i = 0; i < salesArray.length; i++) {
            if (salesArray[i] <= minSale) {
                minSale = salesArray[i];
                monthNumber = i;
            }
        }
        return monthNumber + 1;
    }

    public int belowAverageYearSales (long[] salesArray) { // Ищет количество месяцев с продажами ниже среднего

        long salesAverage = averageYearSales(salesArray);
        int monthsCount = 0;
        for (long sale : salesArray) {
            if (sale < salesAverage) {
                monthsCount++;
            }
        }
        return monthsCount;
    }

    public int aboveAverageYearSales (long[] salesArray) { // Ищет количество месяцев с продажами выше среднего
        long salesAverage = averageYearSales(salesArray);
        int monthsCount = 0;
        for (long sale : salesArray) {
            if (sale > salesAverage) {
                monthsCount++;
            }
        }
        return monthsCount;
    }
}
