package descriptor.person;

public class Person {

    // 属性
    public String name;
    private int age;
    public String sex;

    // 方法
    // 设计一个方法 用来给age属性赋值
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("对不起，您还没出生呢 请给正确的年龄范围");
        } else if (age > 130) {
            System.out.println("对不起，您已经升仙了 请给正确的年龄范围");
        } else {
            this.age = age;
            System.out.println("设置成功");
        }
    }

    // 取得 age 属性的值
    public int getAge() {
        return this.age;
    }
}
