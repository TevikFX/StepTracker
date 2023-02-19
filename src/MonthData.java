import java.util.ArrayList;

public class MonthData {
    ArrayList<Integer> daysOfMonth = new ArrayList<>();

    public MonthData() {
        for (int i = 0; i <= 30; i++) {
            daysOfMonth.add(i, 0);
        }
    }
} 