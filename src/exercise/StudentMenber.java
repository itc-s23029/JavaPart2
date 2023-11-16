package exercise;

import java.time.LocalDate;

public class StudentMenber extends Mamber{
    public LocalDate exproreDate;

    public StudentMenber(long id, String name, LocalDate exproreDate) {
        super(id, name);
        this.exproreDate = exproreDate;
    }

    public LocalDate getExproreDate() {
        return exproreDate;
    }

    public void setExproreDate(LocalDate exproreDate) {
        this.exproreDate = exproreDate;
    }

    @Override
    public int fee() {
        return 500;
    }
    public boolean isExpired(){
        return exproreDate.now().isAfter(exproreDate);
    }
}
