package class_load02;

public class Animal {
    public String test = "AnimalField";
    public static String testStatic = "AnimalStaticFile";

    public void test() {
        System.out.println("我是animal类中的普通方法");
    }

    public static void testStatic() {
        System.out.println("我是animal类中的静态方法");
    }

    {
        this.test();
        System.out.println("我是animal类中的普通块" + this.test);
    }

    static {
        Animal.testStatic();
        System.out.println("我是animal类中的静态块" + Animal.testStatic);
    }
}
