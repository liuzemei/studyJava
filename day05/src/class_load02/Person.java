package class_load02;

public class Person extends Animal {
    public String test = "personField";
    public static String testStatic = "personStaticFile";

    public void test() {
        System.out.println("我是person类中的普通方法");
    }

    public static void testStatic() {
        System.out.println("我是person类中的静态方法");
    }

    {
        System.out.println("我是person类中的普通块");
    }

    static {
        System.out.println("我是person类中的静态块");
    }

    public static void main(String[] args) {
        Person p1 = new Person();
    }

}
