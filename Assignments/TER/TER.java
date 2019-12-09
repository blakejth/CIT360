class MyThread implements Runnable {
private static String output;
private static AtomicReference<Number> threadOutput;

String name;
Thread t;
AtomicReference threadOutput = new AtomicReference();

    MyThread String thread){
    name = threadname; 
    t = new Thread(this, name);
System.out.println("New thread: " + t);
t.start();
}
public void run() {
 try {
     for(int i = 5; i > 0; i--) {
     System.out.println(name + ": " + i);
     threadOutput.getAndSet(new output(name + ": " + i));
     Thread.sleep(1000);
}

}catch (InterruptedException e) {
     System.out.println(name + "Interrupted");
}
     System.out.println(name + " exiting.");
}
executor.shutdown();
}
class MultiThread {
public static void main(String args[]) {
     new MyThread("First Thread: counting backwards from 5:");
     new MyThread("Second Thread: counting backwards from 5:");
     new NewThread("Third Thread: counting backwards from 5:");
try {
     Thread.sleep(10000);
} catch (InterruptedException e) {
      System.out.println("Main thread Interrupted");
}
      System.out.println("Main thread exiting.");
      }
}