package chapter7_7;

import chapter6.Tax;

public class Sample3 {
    public static void main(String[] args) {
        Tax t1 = new Tax(100, "田中宏", 3000000, 1000000);
        sub(t1);
        System.out.println(t1);
    }
    public static void sub(Tax t){
        t.setUnmber(200);
    }
}
