package chapter9_1;

import java.time.LocalDate;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        List<Menber> list = List.of(
                new GeneralMenber(200, "木村一郎"),
                new StudentMember(
                        100, "田中宏",
                        LocalDate.of(2026, 3, 31)),
                new SeniorMember(
                        150, "鈴木浩二",
                        LocalDate.of(1960, 3, 21)
                )
        );

        int total = 0;
        for (Menber menber : list){
            total += menber.fee();
        }
        System.out.println("合計=" + total);
    }
}
