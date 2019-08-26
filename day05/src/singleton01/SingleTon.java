package singleton01;

public class SingleTon {
    // 通过我的设计 让这个类只能创建一个对象

    // 每一个类都有默认无参的构造方法--公有
    //1. 让构造方法变成私有 -- 保证外面不可以随便创建对象
    private SingleTon() {


    }
    // ps: 单例 不是无例 -- 在本类中的某个成员位置上创建唯一的一个对象
    // 在 以下的四个位置 写一行 new SingleTon
    // 属性
    // 方法        不行 每一次执行都会产生一个过程 保证不了唯一
    // 构造方法     不行 私有 本身就是这个构建过程
    // 块          不行 没有返回值 创建了对象也无法给别人使用

    // 2. 在当前类中存在一个属性 是当前类类型的
    private static SingleTon singleTon = new SingleTon();

    public static SingleTon getSingleTon() {
        return singleTon;
    }

}
