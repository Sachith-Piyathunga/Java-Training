imnport java.io.*;

public class Numbers {

    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum() {
        System.out.println("Sum of the numbers are: " + (a + b));
    }

    public void sub() {
        System.out.println("Sub of the numbers are: " + (a - b));
    }

    public static void main(String[] args) {

        Numbers num = new Numbers();

        num.setA(8);
        num.setB(10);

        num.sum();
        num.sub();

    }

}