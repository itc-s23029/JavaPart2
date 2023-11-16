package exercise;

public class Function2 {
    private int a;
    private int b;

    private Function2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Function2(int b){
        this(10, b);
    }
    private Function2(){
        this(10, 5);
    }
    private void result(){
        System.out.println(a + "x + " + b);
    }
    public static void main(String[] args) {
        Function2 f2 = new Function2(12, 3);
        f2.result();
    }

}
