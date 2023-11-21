//package chapter9_1;
//
//public class Sample4 {
//    public static void main(String[] args) {
//        Menber m = new GeneralMenber(200, "木村一郎");
//
//        String msg = switch (m) {
//            case GeneralMenber gem -> "一般会員です";
//            case StudentMember stm -> "学生会員です　期限日=" + stm.getExpireDete();
//            case SeniorMember sem -> "シニア会員です　年齢=" + sem.age();
//            default -> "会員ではありません";
//        };
//    }
//}
