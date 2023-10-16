package school.mjc.stage0.conditions.task3;

import java.time.DateTimeException;
import java.time.YearMonth;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        try {
            YearMonth date = YearMonth.now().withMonth(month);
            System.out.println(date.lengthOfMonth());
        } catch (DateTimeException de) {
            System.out.println("wrong number!");
        }
    }
}
