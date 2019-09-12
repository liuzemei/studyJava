package gc;

public class Test {
    public static void main(String[] args) {
//        Person
//        Person p = new Person();
//        p = null;
//        System.gc();

        // 1. 抽象类 或者 接口 2. 无参数的构造方法没有 3. 构造方法私有（单例模式）
        Runtime r = Runtime.getRuntime();
        long max = r.maxMemory();
        long total = r.totalMemory();
        long free = r.freeMemory();

        System.out.println(max);
        System.out.println(total);
        System.out.println(free);
        System.out.println("-----------");
        byte[] b = new byte[100000000];


        long max1 = r.maxMemory();
        long total1 = r.totalMemory();
        long free1 = r.freeMemory();

        System.out.println(max1);
        System.out.println(total1);
        System.out.println(free1);


    }
}
