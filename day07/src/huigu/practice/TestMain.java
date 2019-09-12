package huigu.practice;

public class TestMain {
    public static void main(String[] args) {
        Bank bank = new Bank();
//        OldMan om = new OldMan("长者");
//
//
//        YoungMan ym = new YoungMan("年轻人");
//        bank.profession(ym);
//
//
//        Toff t = new Toff("有钱人");
//        bank.profession(t);


        // 按照刚才的设计 可能有问题
        // 1. 三个不同的人类方法名不一致（可以）
        // 2. 银行办理业务的方法写了3个
        // 解决如上所述的问题 可以在三个人类智商创建一个父类
        // 1. 解决三个人类中的相同代码 比如 name 属性 比如get方法之类的
        // 2. 父类可以作为参数传入银行

        Person om = new OldMan("长者");
        Person ym = new YoungMan("年轻人");
        Person t = new Toff("有钱人");
        bank.profession(om);
        bank.profession(ym);
        bank.profession(t);
        
    }
}
