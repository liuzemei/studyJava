
import java.util.Scanner;


public class Day03 {
    public static void main(String[] args) {
//        lession1();
        lession2();
    }


    private static void lession1() {
        // 想要在这里使用一个人 来执行操作
        // 创建一个人类的对象 找一个空间来存储
        Person p = new Person(); // p的小人 也有自己的名字 年龄 性别
        p.name = "刘泽美";
        p.age = 18;
        p.sex = "男";

        System.out.println(p.name + "今年" + p.age + "岁，性别是" + p.sex);

        Person p1 = new Person(); // p1另外的一个小人 也有自己的 名字 年龄 性别
        p1.name = "成";
        p1.age = 16;
        p1.sex = "女";
        System.out.println(p1.name + "今年" + p1.age + "岁，性别是" + p1.sex);

    }

    public static void lession2() {
        // 1. 创建一个对象 人类的对象
        Person p = new Person();
        p.name = "刘泽美";
        // 2. 通过对象.调用方法 让方法按照描述的过程执行一遍；
        p.eat();

        String myName = p.tellName();
        System.out.println(myName);
    }


    public static void lession3() {

    }

    // 分支结构
    public static void lession4() {

    }
}























