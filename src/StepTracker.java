import java.util.HashMap;

public class StepTracker {

    HashMap<Integer, MonthData> monthToData = new HashMap<>();

    int purpose = 10000;

    Converter converter = new Converter();

    public StepTracker() {
        for (int i = 0; i <= 12; i++) {
            monthToData.put(i, new MonthData());
        }
    }

    void addSteps(int month, int day, int step) {  // шаги в день
        if ((month <= 12 && month > 0) && (day <= 30 && day >= 0) && step > 0) {
            if (monthToData.containsKey(month)) {
                MonthData stepsPerDay = monthToData.get(month);
                stepsPerDay.daysOfMonth.add(day, step);
                System.out.println("Данные о шагах добавлены");
            }
        } else {
            System.out.println("Данные не верны");
        }
    }

    void outputMonthlyStatistics(int month) { // статистика за месяц
        int sumAllSteps = 0;
        int maxStep = 0;
        int deem = 0;
        int max = 0;

        if (month <= 12 && month > 0) {
            MonthData stepsPerDay = monthToData.get(month);
            for (int i = 1; i <= 30; i++) {
                System.out.println("День " + i + ": " + stepsPerDay.daysOfMonth.get(i) + " шагов.");
            }
            for (int i = 1; i <= 30; i++) {
                sumAllSteps += stepsPerDay.daysOfMonth.get(i);
            }
            for (int i = 1; i <= 30; i++) {
                if (maxStep <= stepsPerDay.daysOfMonth.get(i)) {
                    maxStep = stepsPerDay.daysOfMonth.get(i);
                }
            }

            for (int i = 1; i <= 30; i++) {
                if (stepsPerDay.daysOfMonth.get(i) >= purpose) {
                    deem++;
                    max = deem;
                } else {
                    deem = 0;
                }
            }

            int overTheStep = sumAllSteps / 30;
            System.out.println("Общее количество шагов за месяц: " + sumAllSteps);
            System.out.println("Среднее количество шагов за за месяц: " + overTheStep);
            System.out.println("Максимальное количество шагов за месяц: " + maxStep);
            System.out.println("Максимальная серия: " + max);
            converter.definingDistance(sumAllSteps);
            converter.countingCalories(sumAllSteps);
        } else {
            System.out.println("Не существующий месяц");
        }
    }

    void changePurposeOfSteps(int purposeStep) { //изменить цель
        if (purposeStep > 0) {
            purpose = purposeStep;
            System.out.println("Новая цель: " + purposeStep);
        } else {
            System.out.println("Отрицательная цель не возможна");
        }
    }
} 