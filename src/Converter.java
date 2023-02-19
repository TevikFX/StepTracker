public class Converter {

    void definingDistance(int sumAllSteps) {
        double oneStepMetre = 0.75;
        double distanceKm = (oneStepMetre * sumAllSteps) / 1000;
        System.out.println("За месяц пройдено: " + distanceKm + " км.");
    }

    void countingCalories(int sumAllSteps) {
        double oneStepCal = 50;
        double allCalories = (oneStepCal * sumAllSteps) / 1000;
        System.out.println("За месяц потрачено: " + allCalories + " ккал");
    }
}