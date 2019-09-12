package myenum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyDay myDay = MyDay.MONDAY;
//        Day day = Day.monday;
//        // day --> 枚举类型的对象 默认继承 Object
//        // 除了继承自Object类的方法外 还有一些 compareTo getDeclaringClass name 证明我们自己创建的enum类型 默认继承 Enum;
//        // 我们自己定义的每一个enum类型 都会默认继承 Enum 间接继承Object
//        Day.valueOf("monday"); //调用静态方法 通过name找对象
//        Day[] days = Day.values(); // 获取所有的枚举对象
//        for (Day d : days) {
//            System.out.println(d.name() + "--" + d.ordinal());
//        }
        lesson1();
    }


    public static void lesson1() {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个星期的英文单词：");
        String key = input.nextLine();
        Day day = Day.valueOf(key);
        switch (day) {
            case monday:
                System.out.println("您输入的星期一");
                break;
            case tuesday:
                System.out.println("您输入的星期2");
                break;
            case wednesday:
                System.out.println("您输入的星期3");
                break;
            case thursday:
                System.out.println("您输入的星期4");
                break;
            case firday:
                System.out.println("您输入的星期5");
                break;
            case saturday:
                System.out.println("您输入的星期6");
                break;
            case sunday:
                System.out.println("您输入的星期7");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}
