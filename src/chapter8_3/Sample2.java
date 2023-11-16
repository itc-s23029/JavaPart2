package chapter8_3;

import chapter8_1.GeneralMember;

import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {
        GeneralMember gem = new StudentMember(100, "田中宏", LocalDate.of(2026, 3, 31));

        System.out.println("ID=" +gem.getId());
        System.out.println("氏名=" +gem.getName());
        System.out.println("会費=" +gem.membershipFee());
//        System.out.println("期限日か=" +gem.isExpired());
//        System.out.println("期限日=" +gem.getExpDate());
    }
}
