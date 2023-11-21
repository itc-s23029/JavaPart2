package chapter9_1;

import java.time.LocalDate;

public class Sample3 {
    public static void main(String[] args) {
       Menber m1 = new StudentMember(
                200, "木村一郎",
                LocalDate.of(2026, 3, 31)
        );
//        Menber m1 = new SeniorMember(
//                150, "鈴木浩二",
//                LocalDate.of(1960, 3, 31)
//        );
        if (m1 instanceof StudentMember){
            StudentMember sm = (StudentMember) m1;
            System.out.println("期限日=" + sm.getExpireDete());
        }
        if (m1 instanceof StudentMember stm) {
            System.out.println("期日日=" + stm.getExpireDete());
        }
        Object o = new GeneralMenber(200, "木村一郎");

        if (o instanceof Menber m2){
            System.out.println("名前=" + m2.getNeme());
        }
//        m1.isExpited();
//        StudentMember sm = (StudentMember) m1;
//        System.out.println("期限切れ?=" + sm.isExpird());
    }
}
