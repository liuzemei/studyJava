package gc;

public class Person {
    // hashCode equals toString getClass wait notify notifyAll clone
    // finalize Object

    public void finalize() {
        System.out.println("Person对象回收了");
    }
}
