package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindYearSaleSum () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.yearSalesSum(salesArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageYearSale () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageYearSales(salesArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSalesMonth () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSaleMonthNumber(salesArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSalesMonth () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSaleMonthNumber(salesArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBelowAverageSalesMonths () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowAverageYearSales(salesArray);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAboveAverageSalesMonths () {
        StatsService service = new StatsService();
        long[] salesArray = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageYearSales(salesArray);

        Assertions.assertEquals(expected, actual);
    }
}
