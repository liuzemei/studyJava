
import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
//        lession1();
//        lession2();
        lession4();
    }

    private static void lession1() {
        int a = 5;
        float b = 5;
        System.out.println(a / 2); // 2
        System.out.println(a % 2); // 1
        System.out.println(b / 2); // 2.5
        System.out.println(b % 2); // 1.0
        System.out.println(b++); // 1.0
        System.out.println(b); // 1.0

        /**
         *  运算符 用来指明对于操作数的运算方式
         *
         *  按照操作数的数目来进行分类
         *   单目  双目  三目
         *   a++  a+b    (a>b) ? x : y;
         *
         *  按照运算符的功能来进行分类
         *  -- 算术运算符  +  -  *  /  %(取余)  ++(自增) --
         *  -- 赋值运算符
         *  -- 关系运算符
         *  -- 逻辑运算符
         *  -- 位运算符
         */
    }

    public static void lession2() {
//        int x = 1;
//        x = x+1; // x空间内的值 自己增加1
//        x++; // x空间内的值 自增一个
//        ++x; // 对于x空间内的值来讲 都是一致的 最终的结果都自增了一个
//        int x = 1;
//        int y = x++;// ++在后 先赋值  后自增（先进行计算，后赋值）
//                ++x; 将 x 变量空间的内容先取出 常量区取出1 进行计算 再次存回 x 空间
        // x 在想要做值交换的时候 会产生一个临时的副本空间（备份） ++ 在变量的后面 先备份后自增
        //   最后会将副本空间内的值赋给别人。
//        x==?2  y==?!

//        int a = 1;
//        a = a++;
//        a==?1 2 ---> 1


//        int m = 1;
//        int n = 2;
//        int sum = m++ + ++n-n-- - --m+n-- - --m;
////        m==?0   n==?1  sum==?2

        byte x = 1; // = 自动转化
        x += 2; // 3  x+2 =自动类型提升 3 = 自动转化
        // 主要是等号后面全是常量，就可以进行自动转化
        // 而下边这个是表达式，
//        x = x + 2; // 编译出错 类型从int转化成byte可能有损失
        // x变量空间的值取出 从常量区取过来2 加法运算 结果重新存回x变量空间内
        // x空间--> 1 8bit
        //常量区--> 2 32bit
        // 00000001 + 00000000 00000000 00000000 00000010
        // -> 自动类型提升  8bit1--32bit
        // 00000000 00000000 00000000 00000010 +  00000000 00000000 00000000 00000001
        // 再赋值给 byte 类型 就出错了 (byte) (x + 2);
    }


    public static void lession3() {
        /**
         * 关系运算（比较）
         * > >= < <= != == (对象 instanceof 类)
         * 1. 区分 = 和 == 区别 一个是赋值 一个是比较
         * 2. 比较运算符的最终结果是什么？ boolean  true false
         * 一个条件的判定
         *
         * 逻辑运算符
         *    & 逻辑与   | 逻辑或    ^ 逻辑异或    !逻辑非
         *   && 短路与  || 短路或
         *   (3>2) & (3>4) 两个都为true则为true    --> false
         *   (3>4) | (3>5) 有一个true则为true      --> false
         *   (3>2) ^ (3>4) 前后两个结果不一致为true --> false
         *   !(3>2)单目运算符   取反 -----------------> false
         *   (3>4) && (3>2) = ?
         *
         * 逻辑运算符前后连接的应该是两个 boolean 结果
         * &逻辑与 可以理解为中文的"和"，"并且"的意思 & 前后两个条件必须同时满足 最终才为 true
         *
         * &&短路与
         * 1. 短路 什么情况下才会发生短路？ 当前面的值结果为 false 的时候会发生短路
         * 2. 短路 到底短路的是什么？ 短路的是 && 之后所有计算的过程
         * 3. 如果发生了短路情况 性能比 & 稍微好一点
         * 4. &逻辑与 和 &&短路与 从执行的最终结果来看没有任何区别
         * 5. 短路与不一定提高了性能 只有当前面为 false 的时候才会发生短路 才会提高性能
         *
         */

        /**
         * 位(bit)运算
         *  & 按位与    | 按位或    ^ 按位异或(相同为0 不同为1)   ~按位取反
         *  << 按位左位移  >> 按位右位移  >>>按位右位移(无符号)
         *
         *  byte -- 1字节 -- 8bit
         *  00000000   -2的7次方~2的7次方-1
         *
         *  作用是为了计算
         * 两个变量交换 --> 高级玩法：
         * a = a^b;
         * b = a^b;
         * a = a^b;
         */
    }

    // 分支结构
    public static void lession4() {
        /**
         * Java语法结构
         *   顺序结构
         *   分支结构  if  switch
         *   循环结构  for while do..while
         *
         * 需求？ 设计一个小程序 帮我学习英文（星期七个单词）
         * 1--> Monday
         *
         */
//        Scanner input = new Scanner(System.in);
//        System.out.println("请您输入一个数字，我来输入对应的英文");
//        int day = input.nextInt(); //可以读取我们输入的数字
//        if (day==1) System.out.println("Monday");

        /**
         * 想要利用 Scanner 需要如下三步
         * 1. 在类上面的第一行 import java.util.Scanner;
         * 2. 需要输入之前 Scanner y = new Scanner(System.in); //对象
         * 3. 通过int a = y.nextInt(); //读取数字
         *    通过String b = y.nextLine(); //读取字符串
         */

        /**
         * 小任务：
         * 1. 利用 if 语句实现一个 判断给定月份对应的季节 -> 345春天 678夏天 9 10 11 秋天 12 1 2 冬天
         * 2. 利用if语句实现一个 判断学生成绩对应的区间
         * 3. 利用if实现一个随机摇色子的小游戏 Math.random()
         */

        int a = (int) Math.floor(Math.random() * 6) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入随机的一个数字");
        int b = input.nextInt();
        if (b == a) {
            System.out.println("恭喜您赢得胜利！");
        } else {
            System.out.println("猜错了，再接再厉");
        }
    }

    public static void chargeSeason() {
        // 1. 创建一个mounth变量 用来存储一个月份值（Scanner）
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要查询的月份");
        int mouth = input.nextInt(); // 帮我们读取输入的数字
        switch (mouth) {
            case 3:
            case 4:
            case 5:
                System.out.println("春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬天");
                break;
            default:
                System.out.println("输入内容有误");
        }
    }

    private static void lession5() {
        /**
         * 循环结构  for  while  do..while
         * for循环 注意：如果在for()的括号里面初始化的变量，在循环结束的时候就被销毁了。
         */
//        for (int round = 1; ; round++) {
//            System.out.println("跑到第" + round + "圈啦");
//        }

        /**
         * 应用题： 操场上有一百多人  让他们排队  三个人一组  多一个， 四个人一组 多两个，五个人一组 多两个 问操场上的人数多少？
         */

        int peopleTotal = 100;
        for (; peopleTotal < 200; peopleTotal++) {
            if (peopleTotal % 3 == 1 && peopleTotal % 4 == 2 && peopleTotal % 5 == 2) {
                System.out.println("操场上一共有" + peopleTotal + "人");
            }
        }
    }

    public static void lession6() {
        /**
         * 数组（容器）
         * 数组是一组数据类型相同的数据的组合， 将这些数据统一的管理起来
         * 数组是一个引用数据类型，数组内存储的类型可以是基本类型 也可以是引用类型
         *
         * 1. 数组的定义（声明）
         *      数据类型[] 数组名字;
         *      int[] x;
         *      char[] y;
         *      boolean[] z;
         *      String[] m;
         * 2. 数组的赋值（初始化）
         *      静态初始化   有长度  有元素
         *          int[] array = new int[]{10,20,30,40,50};
         *          int[] array = {10,20,30,40,50}; // ok --> 只有在初始化的时候可以省略 new int[]
         *          int[] array;
         *          array = {10,20} // error
         *
         *      动态初始化
         * 3. 数组的访问
         * 4. 数组元素的遍历（轮询）
         *
         */
        int[] array = new int[]{1, 2, 3, 4, 5};
    }
}























