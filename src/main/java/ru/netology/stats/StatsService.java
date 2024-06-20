package ru.netology.stats;

public class StatsService {
//    SumSales     - сумму всех продаж;
//    Average sale - среднюю сумму продаж в месяц;
//    Peak sales   - номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
//    Min Sales    - номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
//    Below the average - количество месяцев, в которых продажи были ниже среднего (см. п.2);
//    Above average     - количество месяцев, в которых продажи были выше среднего (см. п.2).


    public int SumSales(int[] arrs) {  // сумма всех продаж за все месяцы.
        int sumSales = 0;
        for (int i = 0; i < arrs.length; i++) {
            sumSales = sumSales + arrs[i];
        }
        return sumSales;
    }

    public int AverageSale(int[] arrs) {   // средняя сумма продаж
        int averageSale = SumSales(arrs) / (arrs.length);
        return averageSale;
    }

    public int PeakSales(int[] arrs) {    // номер месяца высоких продаж
        int peakSales = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] >= arrs[peakSales]) {
                peakSales = i;
            }
        }
        return peakSales + 1;
    }


    public int MinSales(int[] arrs) {  // номер месяца минимальных продаж
        int minMonth = 0;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] <= arrs[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int BelowTheAverage(int[] arrs) {  // количество месяцев, в которых продажи были ниже среднего
        int monthsWithMinimalSales = 0;   // Months with minimal sales  Месяцы с минимальными продажами
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] < AverageSale(arrs))
                monthsWithMinimalSales++;

        }
        return monthsWithMinimalSales;
    }

    public int AboveAverage(int[] arrs) {  // количество месяцев, в которых продажи были выше среднего
        int monthsWithMaxSales = 0;   //High sales months  Месяцы с высокими продажами
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > AverageSale(arrs))
                monthsWithMaxSales++;

        }
        return monthsWithMaxSales;
    }

}
