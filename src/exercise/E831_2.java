package exercise;

import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.List;

public class E831_2 {
    public static void main(String[] args) {
        List<Mamber> list = List.of(
                new GeneralMember(200, "木村一郎"),
                new StudentMenber(100, "田中宏", LocalDate.of(2025, 3, 31)),
                new SenirMenber(150, "鈴木浩二",LocalDate.of(1960, 3, 31))
        );
        int total = 0;
        for (Mamber m: list) {
            total += m.fee();
        }
        System.out.println("合計=" + total);
    }
}
