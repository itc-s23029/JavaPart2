package chapter7_9;

import exercise.Rectangle;

public class Sample1 {
    public static void main(String[] args) {
        Id id = new Id(100, "田中宏");
        Tax tax = new Tax(id, 3000000, 1000000);
        System.out.println(tax);

        tax.getId().setNumber(200);
        System.out.println(tax);
    }
}
