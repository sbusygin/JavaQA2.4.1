package ru.netology.stats;

public class StatsService {

    public int allSalesSum(int[] sales) {
        int sum = 0;
        for (int item : sales) {
            sum += item;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        return allSalesSum(sales)/sales.length;
    }

    public int maxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++ ){
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return ++maxMonth;
    }

    public int minMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++ ){
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return ++minMonth;
    }

    public int underAverage(int[] sales) {
        int monthCount = 0;
        int average = averageSum(sales);
        for (int item : sales) {
            if (item < average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int overAverage(int[] sales) {
        int monthCount = 0;
        int average = averageSum(sales);
        for (int item : sales) {
            if (item > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

}
