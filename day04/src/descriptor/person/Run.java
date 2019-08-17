package descriptor.person;

public class Run {
    public static void main(String[] args) {
        // 创建类的过程是Java中描述的过程
        // 1. 创建对象
        Person p = new Person();
        // 2. 对象的引用 . 调用属性

        p.name = "刘泽美";
        p.setAge(18);
        p.sex = "男";

        System.out.println(p.name + "今年" + p.getAge() + "岁");
    }
}
