package exercise;

import java.time.LocalDate;

public class SenirMenber extends Mamber{
    private LocalDate birtday;

    public SenirMenber(long id, String name, LocalDate birtday) {
        super(id, name);
        this.birtday = birtday;
    }

    public LocalDate getBirtday() {
        return birtday;
    }

    public void setBirtday(LocalDate birtday) {
        this.birtday = birtday;
    }

    @Override
    public int fee() {
        return 700;
    }
}
