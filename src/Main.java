public class Main {

    public static void main(String[] args) {
        CommandProcessor commandProcessor = new CommandProcessor();

        while (true) {
            commandProcessor.printMainMessage();
            Integer command = commandProcessor.enterCommand();

            switch (command) {
                case 1:
                    commandProcessor.addSteps();
                    break;
                case 2:
                    commandProcessor.printMonthStatistic();
                    break;
                case 3:
                    commandProcessor.printPurposeSteps();
                    break;
                case 4:
                    commandProcessor.endProgram();
                    System.exit(0);
                default:
                    commandProcessor.printCommandNotExist();
            }
        }
    }
}