
### Scanner类
1. 所属的包 java.util包 需要 import导入
2. 通过一个带输入流的构造方法创建对象
3. 常用的方法  nextInt()  nextFloat()  next()  nextLine()

### System类
1. 所属的包 java.lang包
2. 不需要创建对象 通过类名就可以访问
3. 有3个属性 in out err
4. 常用的方法 
    1. gc() 
    2. exit()
    3. console() 
    4. arraycopy()
    5. currentTimeMillis() 返回当前时间的毫秒值
    
    
    
    
# 日期相关
### 1. Date类
1. 通常使用的是 java.util包 需要 import 导入
2. 构建对象 通常使用无参数的构造方法 或者 long类型参数 构造方法
3. Date类中常用的方法
    1. before()
    2. after()
    3. setTime() ----> long
    4. getTime() ----> long
    5. compareTo()
4. 可以处理一个Date日期的格式

### 2. DateFormat
1. 所属的包 java.text 需要导包使用
2. 此类是一个抽象类 不能创建对象 通过子类使用

### 3. SimpleDateFormat
1. 调用带String参数的构造方法创建format对象
```
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String v = sdf.format(date1); // 通过sdf对象将date1格式化成你描述的样子
```
### Calendar类
1. 所属的包 java.util 需要导包
2. 有构造方法 用protected修饰的 通常访问不到  通常会调用默认的getInstance()
3. 常用方法
    1. before()
    2. after()
    3. setTime() ---> Date
    4. getTime() ---> Date
    5. getTimeInMillis()
    6. set(Calendar.YEAR, 2015)
    7. get(Calendar.YEAR)
    
### TimeZone 
1. java.util包
2. 可以通过 calendar对象.getTimeZone() 获取 或 TimeZone.getDefault();
3. 常用方法
    1. getID() --> Asia/Shanghai
    2. getDisplayName() --> 中国标准时间
    

# 字符串相关

### String类
1. 所属的包 java.lang 包 
2. 找寻构造方法创建对象
    1. String s1 = "abc";
    2. String s2 = new String("abc");
    3. String是一个非常特殊的引用数据类型 可以像基本类型一样 创建 赋值













































