package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void SalesSumCorrectCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SalesAvgCorrectCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxMonthSaleCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxMonthSale(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinMonthSaleCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minMonthSale(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LessAvgSaleMonthCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countLessAvgMonth(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MoreAvgSaleMonthCountTest() {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countMoreAvgMonth(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}