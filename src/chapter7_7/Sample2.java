package chapter7_7;

import chapter6.Tax;

public class Sample2 {
    public static void main(String[] args) {
        Tax t1 = new Tax(100, "田中宏", 3000000, 1000000);
        Tax t2 = t1;

        t2.setUnmber(200);
        System.out.println(t1);
        System.out.println(t2);
    }
}
