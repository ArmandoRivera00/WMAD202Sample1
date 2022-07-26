package ca.ciccc.wmad.assignment9.problem1;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.function.Supplier;
public class SupplierExample {
    public static void test(){
        LocalDate birthday = LocalDate.of(2000, 08, 09);
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(Period.between(birthday,LocalDate.from(time)).getYears());
    }
}
