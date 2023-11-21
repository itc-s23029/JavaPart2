package chapter9_1;

import exercise.StudentMenber;

import java.time.LocalDate;

public class StudentMember extends Menber{
    private LocalDate expireDete;


    public StudentMember(long id, String name, LocalDate expireDete) {
        super(id, name);
        this.expireDete = expireDete;
    }

    @Override
    public int fee() {
        return isExpird() ? 1000 : 700;
    }

    public boolean isExpird(){
        LocalDate today = LocalDate.now();
        return today.isAfter(expireDete);
    }

    public LocalDate getExpireDete(){
        return expireDete;
    }
}
