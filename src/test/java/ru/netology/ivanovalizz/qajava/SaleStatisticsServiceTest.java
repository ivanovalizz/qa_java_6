package ru.netology.ivanovalizz.qajava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleStatisticsServiceTest {

    @Test
    public void shouldFindYearSaleSum () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.yearSalesSum(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageYearSale () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageYearSales(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSalesMonth () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSaleMonth(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSaleMonth(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowAverageSalesMonths () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAverageYearSales(array);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAverageSalesMonths () {
        SaleStatisticsService service = new SaleStatisticsService();
        long[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.aboveAverageYearSales(array);

        Assertions.assertEquals(expected, actual);
    }
}
