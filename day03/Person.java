public class Person {
    // 这个文件是在计算机内画的一张图纸
    // 描述计算机里的人类长成什么样子

    // 属性--静态描述特点
    // 属性有三个必要组成部分
    // 权限修饰符  [特征修饰符]   数据类型   属性名字   [=值];
//    public final String name;
    public String name; // 全局变量
    public int age;
    public String sex;

    /**
     * 主方法不是属于类的，是属于虚拟机的。
     */


    // 方法--描述可以做什么事情（动作）
    public void eat() {
        System.out.println("吃了一大碗米饭");
    }

    // 设计一个方法 用来打印自己的名字
    // 若方法的设计规定了返回值类型  方法内必须通过 return 关键字返回一个值
    public String tellName() {
        System.out.println("你想知道我的名字？勉强告诉你一下");
        return this.name;
    }

}