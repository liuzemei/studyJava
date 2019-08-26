package duotai05;

public class Main {
    public static void main(String[] args) {
//        Person t = new Teacher();
//
//        t.eat();
//        t.sleep();
//        t.talk();
//        t.teach();

        Object o = new Teacher();
        o.hashCode();
        o.toString();

        Animal a = (Animal) o;

        System.out.println(a.name); // animal的
        a.sleep();// 没有重写 person重写了 执行 person的sleep
        a.eat(); // 执行teacher的eat方法

        Person p = (Person) a;
        System.out.println(p.name); // person 的属性
        p.sleep(); // 人类的睡觉
        p.eat(); // 老师的吃饭
        p.talk(); // 人类的说话


        Student s = (Student) o; //运行时异常 ClassCastException
    }
}
