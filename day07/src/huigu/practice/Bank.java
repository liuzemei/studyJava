package huigu.practice;

public class Bank {

    // 等待用户办理业务
//    public void profession(OldMan om) {
//        System.out.println(om.getName() + "客户进入银行啦");
//        om.callNumber();
//        om.transact();
//        om.leave();
//    }
//
//    public void profession(YoungMan ym) {
//        System.out.println(ym.getName() + "客户进入银行啦");
//        ym.callNumber();
//        ym.transact();
//        ym.leave();
//    }
//
//    public void profession(Toff t) {
//        System.out.println(t.getName() + "客户进入银行啦");
//        t.callNumber();
//        t.transact();
//        t.leave();
//    }


    public void profession(Person person) {
        System.out.println(person.getName() + "客户进入银行啦");
        person.callNumber();
        person.transact();
        person.leave();
    }
}
