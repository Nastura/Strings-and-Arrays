package ru.netology.stats;

public class StatsService {
//    SumSales     - сумму всех продаж;
//    Average sale - среднюю сумму продаж в месяц;
//    Peak sales   - номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
//    Min Sales    - номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
//    Below the average - количество месяцев, в которых продажи были ниже среднего (см. п.2);
//    Above average     - количество месяцев, в которых продажи были выше среднего (см. п.2).


    public long sumSales(long[] arrs) {  // сумма всех продаж за все месяцы.
        long sumSales = 0;
        for (int i = 0; i < arrs.length; i++) {
            sumSales =  (sumSales + arrs[i]);
        }
        return sumSales;
    }

    public long averageSale(long[] arrs) {   // средняя сумма продаж
        long averageSale = sumSales(arrs) / (arrs.length);
        return averageSale;
    }

    public int peakSales(long[] arrs) {    // номер месяца высоких продаж
        int peakSales = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] >= arrs[peakSales]) {
                peakSales = i;
            }
        }
        return peakSales + 1;
    }


    public int minSales(long[] arrs) {  // номер месяца минимальных продаж
        int minMonth = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] <= arrs[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int belowTheAverage(long[] arrs) {  // количество месяцев, в которых продажи были ниже среднего
        int monthsWithMinimalSales = 0;   // Months with minimal sales  Месяцы с минимальными продажами
        long average = averageSale(arrs);
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] < average)
                monthsWithMinimalSales++;

        }
        return monthsWithMinimalSales;
    }

    public int aboveAverage(long[] arrs) {  // количество месяцев, в которых продажи были выше среднего
        int monthsWithMaxSales = 0;   //High sales months  Месяцы с высокими продажами
        long average = averageSale(arrs);
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > average)
                monthsWithMaxSales++;

        }
        return monthsWithMaxSales;
    }

}
