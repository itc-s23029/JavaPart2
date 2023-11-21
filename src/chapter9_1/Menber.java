package chapter9_1;

public abstract class Menber {
    private long id;
    private String name;

    protected Menber(long id, String name) {
        this.id = id;
        this.name = name;
    }

    protected abstract int fee();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNeme() {
        return name;
    }

    public void setNeme(String neme) {
        this.name = neme;
    }
}
