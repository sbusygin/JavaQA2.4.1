package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int[] sales = new int[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void allSalesSum() {
        StatsService statsService = new StatsService();
        int expected = 180;
        int result = statsService.allSalesSum(sales);
        assertEquals(expected, result);
    }

    @Test
    void averageSum() {
        StatsService statsService = new StatsService();
        int expected = 15;
        int result = statsService.averageSum(sales);
        assertEquals(expected, result);
    }

    @Test
    void maxMonth() {
        StatsService statsService = new StatsService();
        int expected = 6;
        int result = statsService.maxMonth(sales);
        assertEquals(expected, result);
    }

    @Test
    void minMonth() {
        StatsService statsService = new StatsService();
        int expected = 9;
        int result = statsService.minMonth(sales);
        assertEquals(expected, result);
    }

    @Test
    void underAverage() {
        StatsService statsService = new StatsService();
        int expected = 5;
        int result = statsService.underAverage(sales);
        assertEquals(expected, result);
    }

    @Test
    void overAverage() {
        StatsService statsService = new StatsService();
        int expected = 5;
        int result = statsService.overAverage(sales);
        assertEquals(expected, result);
    }
}