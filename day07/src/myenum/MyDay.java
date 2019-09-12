package myenum;

public class MyDay { // 描述星期
    // 类似单例模式的想法
    // 构造方法私有
    private MyDay() {
    }

    // 所有对象都是属性
    public static final MyDay MONDAY = new MyDay();
    public static final MyDay TUESDAY = new MyDay();
    public static final MyDay WEDNESDAY = new MyDay();
    public static final MyDay THURSDAY = new MyDay();
    public static final MyDay FIRDAY = new MyDay();
    public static final MyDay SATURDAY = new MyDay();
    public static final MyDay SUNDAY = new MyDay();


    // 一般属性 一般方法随便设计
    private String name;
}
