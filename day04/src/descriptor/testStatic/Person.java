package descriptor.testStatic;

public class Person {
    public String name;
    public static int age; // 斜体

    static {
        System.out.println("静态块加载");
    }

    public Person() {
        System.out.println("我是构造方法");
    }

    public void test() {
        System.out.println("我是普通方法");
    }

    public static void testStatic() {
        System.out.println("我是静态方法");
    }


    public static void main(String[] args) {
        try {
            // 通过类的全名字 反射机制加载类
            Class.forName("descriptor.testStatic.Person");
        } catch (Exception e) {
            System.out.println(e);
        }
//        Person p1 = new Person();

    }


//    public static void main(String[] args) {
//        Person p1 = new Person();
//
//        p1.name = "刘泽美";
//        p1.age = 18;
//
//        Person p2 = new Person();
//        p2.name = "test";
//        p2.age = 16;
//
//        System.out.println(p1.name + "今年" + p1.age + "岁");
//        System.out.println(p2.name + "今年" + p2.age + "岁");
//    }

}
