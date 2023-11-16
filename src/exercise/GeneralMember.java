package exercise;

public class GeneralMember  extends Mamber {

    public GeneralMember(long id, String name) {
        super(id, name);
    }

    @Override
    public int fee() {
        return 1000;
    }
}
