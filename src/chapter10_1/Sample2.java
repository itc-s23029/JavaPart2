package chapter10_1;

import javax.swing.text.Style;
import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {
        Attendable at1 =
                new Student(10, "田中博", "tanaka@gmail.jp", 2, LocalDate.of(2000, 1, 1));

        Attendable at2 =
                new AuditingStudent(20, "木村健", "kimura@gmail.jp", 3, 112);

        if (at1 instanceof Student){
            System.out.println("sutdent");
        }
        if (at1 instanceof Attendable){
            System.out.println("attendable");
        }
        if (at1 instanceof AuditingStudent){
            System.out.println("auditingStudent");
        }
    }
}
