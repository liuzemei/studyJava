package descriptor.packb;

import descriptor.packa.TestA;

public class TestB extends TestA {
    public static void main(String[] args) {
//        this.testProtected();
        TestA ta = new TestA();
        ta.testPublic();
//        ta.testProtected();
//        ta.testDefault();
//        ta.testPrivate();
    }

    public void testB() {
        this.testProtected();
        this.testPublic();
    }
}
