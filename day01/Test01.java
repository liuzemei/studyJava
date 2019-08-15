public class Test01 {
    public static void main(String[] args) {
//        System.out.println("hello world");
//        lession1();
//        dataType();
        lession2();

    }

    public static void lession1() {
        byte x;
        x = 1;
        System.out.println(x);
        /**
         * 计算机底层做了什么事情？
         * 1. x是什么？ 变量空间 存在哪儿？ ---> 栈内存
         * 2. 1是什么？ 1是常量 存在哪儿？  ---> 常量缓冲区
         * 3. =是什么？ =是赋值 做了什么？  ---> 常量缓冲区复制一份，到栈内存的变量空间中。
         *
         * 补充：计算机的硬件组成
         * 主板 cpu 声卡 显卡 网卡 电源 内存 硬盘
         * 1. 硬盘上创建了一个文件 Test.java
         * 2. 文件中的内容是我们编写的源代码（跟计算机发送指令）
         * 3. 将Test.java源文件--->编译----》 Test.class
         *      内容 我们看不懂 字节码 留给计算机识别
         * 4. 执行 ---> 内存中执行
         *      将硬盘上的Test.class内容 加载到内存里
         * 5. 我们写好的指令  执行内存的空间 赋值 变化。。。
         */
    }

    public static void dataType() {
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 2147483648L;
        float e = 3.4F;
        double f = 4.5;
        char g = 'a';
        boolean h = true;

        String i = null;
        i = "abc";
        i = null;
        System.out.println(i);

        /**
         * float e = 3.4 --> 报错：从double转化到float会有损失
         * 1 3.4 常量值 ---> 存储在常量缓冲区中的
         * 常量值的存储形式肯定不是十进制，是以二进制形式存储。
         * 1 ---> 32bit( int )
         * 3.4 ---> 43bit( double )
         * 解决方案 --> 在数字后边，加上一个F
         *
         * 问题1 ： 为什么 byte a = 1 相当于是 int -> byte 没有问题呢？
         * 1 ---> 32bit ---> 00000000 00000000 00000000 00000001
         * a ---> 8bit ----> 00000001
         * "="在赋值的时候做了一个自动的决定 自动类型转换。如果前24位出现一个1，那么就会报错。
         *
         * 问题2 ： byte d = 2147483648 报错： 过大的整数
         * 常量的数字---> 32bit(int) ---> -2147483648 ~ 2147483647 超过范围就会报错。
         * 解决方案： 在数字后面，加上一个L
         */

        /**
         *  字符     字符串
         *  char    String
         *  基本      引用
         *  'a'     "a" "abc" "" null
         */
    }

    /**
     * 数据类型之间的转化问题
     */
    public static void lession2() {

//        int a = 1;
//        int b = a; // ok

//        int a = 200;
//        byte b = (byte) a; // ok (强制类型转换）
//        byte a = 97;
//        char b = (char) a;
//        System.out.println(b);

//        boolean a = true;
//        int b = (int) a; //error: boolean无法转换为int
//        System.out.println(b);


        /**
         * 1. 同种数据类型之间是可以直接进行赋值操作
         * 2. 数据类型不同的空间 之间的赋值 ----> 转换问题
         *
         *      同种大数据类型之间才能发生转换
         *          基本类型-----基本类型之间  可以直接转换（自动 强制）
         *          引用类型-----引用类型之间  可以直接转换（自动 强制--上转型  下转型）
         *          基本类型-----引用类型之间  不可以直接转换（间接--包装类/封装类）
         * 3. 保证大数据类型一致的前提下
         *      基本类型----基本类型
         *          小数据类型相同
         *            都是整型 都是浮点
         *              byte a=1; int b=a; // 自动直接转化
         *              int a=1; byte b= (byte) a; // 强制类型转换
         *              float x=3.4F; double y=x; // 自动直接转化
         *              double x=3.4F; float y= (float) x; // 强制类型转换
         *
         *              1. 比较内存空间的大小
         *              2. 大 -> 小 强制类型转换（有可能丢失精度）
         *                 小 -> 大 自动类型转化
         *
         *          小数据类型不同
         *            整数----浮点型
         *              两个比较精确程度 浮点型精确程度更高 可以直接存放整数 反之需要强制转换
         *              任何一个浮点型都可以直接存放一个整型。
         *              int a = 1; float b= a; // 自动直接转化
         *              float a = 1.0F; int b = (int)a; //强制类型转换（强行去掉小数点后面的数字）
         *            char----整数
         *              char x = 'a'; int y = x; // 自动直接转化
         *              byte x = 97;
         *            布尔类型只有1bit 不能与其他基本类型之间发生转化
         *      引用类型之间后续...
         *
         */
    }
}