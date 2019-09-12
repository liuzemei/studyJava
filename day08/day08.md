Java开发者写好的类 --- 专业文档 API

包装类
数学相关
日期相关
字符串
集合相关
异常相关
输入输出相关（I/O)（流）
线程相关 Thread.sleep wait notify
网络通信
反射注解



1. 类所在的
2. 类的关系 自己默认继承 实现
3. 是否可以创建对象 调用 方法本身静态的
4. 类中提供的常用方法


# 包装类（封装类）
byte--Byte short-Short int-Integer long-Long
float-Float double-Double char-Character boolean-Boolean

1. 八个包装类都在同一个包下 java.lang包 
2. 八个包装类前6个都是与数字相关的 都默认继承父类 Number
3. 八个包装类都实现了 Serializable, comparable
4. 八个包装类都有带自己对应类型参数的构造方法
    除了Character都有构造方法重载，带String类型
5. 创建对象 对象调用属性/方法
    Number xxxValue() 将一个包装类类型转化为对应的基本类型（拆包）
```java
// 1.5版本之前 手动拆装包
public class a{
Integer i1 = new Integer(10); // 引用数据类型 包装类
int value = i1.intVlue(); // 
// 1.5版本之后 自动拆装包
Integer i2 = 10;
int value = new Integer(10);


int value = Integer.parseInt("123");
int value = new Integer("123");
}
```
6. 经常在笔试中出现的问题
```java
public class b {
    Integer i1 = 10;
    Integer i2 = 10;
    Integer i3 = new Integer(10);
    Integer i4 = new Integer(10);
}
```


# 数学相关
### Math
1. 所属的包 java.lang
2. Math 构造方法是私有的 我们不能直接调用创建对象
3. 由于Math中提供的属性及方法都是 static 不需要创建对象
4. 常用的方法
    1. abs 返回给定数字的绝对值
    2. ceil 向上取整  floor 向下取整 rint round 四舍五入(前面三个返回值是double round是int)
    3. max(a,b) min(a,b)  
    4. pow(a,b) (参数和返回值都是double) a的b次方
    5. sqrt(a) 获取给定参数的平方根
    6. random() 随机产生一个[0.0,1.0)区间的数 返回值 double
5. Math.random()计算小数的时候精确程度可能有些损失


### Random类
1. 在java.util包中的类 需要import导入
2. 没有任何继承关系 默认继承Object类
3. 查找构造方法-->如何创建对象
4. 类中提供的常用方法
    1. r.nextInt(); 随机产生 int 取值范围的整数 有正有负
    2. r.nextInt(int bound); 随机产生一个[0,bound)的整数
    3. r.nextFloat() 随机产生一个 [0.0, 1.0)的小数


### UUID
1. 所属的包 java.util  需要import导入
2. 没有任何继承关系 默认继承Object类
3. 构造方法有 没有无参数的 通常我们不会创建对象
```
UUID uuid = UUID.randomUUID();
System.out.println(uuid.toString()); // 数据库表格主键
```
产生一个32位的随机元素 每一个位置是一个16进制的数字

### BigInteger类 大整数
1. 所属的包 java.math 需要import导入
2. 继承自Number
3. 如何创建对象 提供的构造方法全部都是带参数的
    1。 通常利用带String参数的构造方法创建这个类的对象 `BigInteger a = new BigInteger("123")`
4. 类中的常用方法
    1. 四则运算 add() subtract() multiply() divide()
5. 小例子 设计一个方法 用来计算给定数字的阶乘  


### BigDecimal类 大小数
1. 所属的包 java.math 需要import 导入
2. 继承了Number类
3. 通常也是可以通过 带String参数 构建对象
4. 类中的常用方法
    1. 四则运算 add() subtract() multiply() divide()
    2. setScale(2, BigDecimal.ROUND_DOWN); 前面是保留小数点之后的位数  后面参数是设置的模式 
    
    
### DecimalFormat
1. 所属的包 java.text 需要 import 导入
2. 通过带STring参数的构造方法创建一个格式化对象  0 #

    
# 日期相关
### Date

### Calendar

### TimeZone


# 字符串相关
### String

### StringBuffer

### StringBuilder



















































