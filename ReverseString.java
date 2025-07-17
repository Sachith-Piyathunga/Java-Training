// Create a class Counter with a static variable to count number of objects created.

class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object number: " + count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
