import java.util.Scanner;

public class CommandProcessor {
    private final Scanner scanner = new Scanner(System.in);
    private final StepTracker stepTracker = new StepTracker();

    public void printMainMessage() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Ввести данные за день");
        System.out.println("2 - Напечатать статистику за месяц");
        System.out.println("3 - Изменить цель по количеству шагов за день");
        System.out.println("4 - Выйти из приложения");
    }


    public Integer enterCommand() {
        System.out.println("Введите команду");
        return scanner.nextInt();
    }


    public void addSteps() {
        print("Введите месяц");
        int month = scanner.nextInt();
        print("Введите день");
        int day = scanner.nextInt();
        print("Введите количество шагов");
        int step = scanner.nextInt();
        stepTracker.addSteps(month, day, step);
    }

    public void printMonthStatistic() {
        print("За какой месяц вывести статистику?");
        int month = scanner.nextInt();
        stepTracker.outputMonthlyStatistics(month);
    }

    public void printPurposeSteps() {
        print("Введите цель по количеству шагов");
        int purpose = scanner.nextInt();
        stepTracker.changePurposeOfSteps(purpose);
    }

    public void endProgram() {
        print("Программа завершена");
    }

    public void printCommandNotExist() {
        print("Такой команды нет");
    }


    public static void print(String message) {
        System.out.println(message);
    }

} 