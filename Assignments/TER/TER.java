import java.util.*;
import java.lang.*;

public class Test extends Thread {
    private static String testString;
    private static Veggie veggie;
    private static AtomicReference<String> atomicString;
    private static AtomicReference<Veggie> atomicVeggie;
    private static ExecutorService executor = null;

    public static void main(String[] args) throws Exception {
        testString = "Aucchini";
        veggie = new Veggie("Aucchini", 0);
        atomicString = new AtomicReference<String>(testString);
        atomicVeggie = new AtomicReference<Veggie>(veggie);

        int a = 8;

        ExecutorService executor = Executors.newFixedThreadPool(a);
        
        for (int i = 0; i < a; i ++) {
            executor.execute(new Run1());
            executor.execute(new Run2());
        }
        executor.shutdown();
    }

    public static class Run1 implements Runnable {
        public void run() {
            atomicString.compareAndSet(testString, "Carrot");
            testString = testString.concat("-Carrot");
            veggie.setQuantity(veggie.getQuantity() + 1);
            veggie.setName("Carrot");
            atomicVeggie.getAndSet(new Veggie("Carrot", 1));
            System.out.println("\n" + Thread.currentThread().getName());
            System.out.println("\n" + "veggie= " + veggie + " testString= " + testString);
            System.out.println("\n" + "atomicVeggie = " + atomicVeggie + " atomicString= " + atomicString);
        }
    }

    public static class Run2 implements Runnable {

        public void run() {
            testString = testString.concat("-Pear");
            veggie.setQuantity(veggie.getQuantity() + 2);
            veggie.setName("Pear");
            atomicString.lazySet("Pear");
            atomicVeggie.set(new Veggie("Pear", 2));
            System.out.println("\n" + Thread.currentThread().getName());
            System.out.println("\n" + "veggie= " + veggie + " testString= " + testString);
            System.out.println("\n" + "atomicVeggie = " + atomicVeggie + " atomicString= " + atomicString);
        }
    }

    static class Veggie {

        private String name;
        private int quantity;

        public Veggie(String name, int quantity) {
            this.name = name;
            this.quantity= quantity;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "Last inventoried " + this.quantity + " " + this.name;
        }
    }
}