package ru.netology.ivanovalizz.qajava;

public class SaleStatisticsService {

    public long yearSalesSum (long[] array) { // Ищет сумму всех продаж за год
        long sum = 0;
        for (long l : array) {
            sum = sum + l;
        }
        return sum;
    }

    public long averageYearSales (long[] array) { // Ищет среднее значение продаж в месяц
        long sum = 0;
        for (long l : array) {
            sum = sum + l;
        }
        return sum / 12;
    }

    public long maxSaleMonth (long[] array) { // Ищет месяц с максимальными продажами
        long maxSale = array[0];
        int month = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxSale) {
                maxSale = array[i];
                month = i;
            }
        }
        return month + 1;
    }

    public long minSaleMonth (long[] array) { // Ищет месяц с минимальными продажами
        long minSale = array[0];
        int month = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minSale) {
                minSale = array[i];
                month = i;
            }
        }
        return month + 1;
    }

    public long belowAverageYearSales (long[] array) { // Ищет количество месяцев с продажами ниже среднего
        long sum = 0;
        for (long l : array) {
            sum = sum + l;
        }
        long average = sum / 12;
        int count = 0;
        for (long l : array) {
            if (l < average) {
                count++;
            }
        }
        return count;
    }

    public long aboveAverageYearSales (long[] array) { // Ищет количество месяцев с продажами выше среднего
        long sum = 0;
        for (long l : array) {
            sum = sum + l;
        }
        long average = sum / 12;
        int count = 0;
        for (long l : array) {
            if (l > average) {
                count++;
            }
        }
        return count;
    }
}
