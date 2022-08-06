package ru.netology.stats;

public class StatService {

    public long sum(long[] sales) {
        //1. Сумма всех продаж
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        //2. Средняя сумма продаж в месяц
        return sum(sales) / 12;
    }

    public int maxMonthSale(long[] sales) {
        //3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
        int maxMonth = 0;
        int month=0;
            for (long sale : sales) {
                    if (sale >= sales[maxMonth]) {
                    maxMonth = month;
                    }
                    month ++;
            }
        return maxMonth+1;
    }

    public int minMonthSale(long[] sales) {
        //4.Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth+1;
    }

    public int countLessAvgMonth(long[] sales) {
        //5.Кол-во месяцев, в которых продажи были ниже среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int countMoreAvgMonth(long[] sales) {
        //6. Кол-во месяцев, в которых продажи были выше среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}