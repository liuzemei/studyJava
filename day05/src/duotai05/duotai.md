## 多态

同一个对象 体现出来的多种不同形态(身份)，将一种行为表现出不同的效果

> 要想实现多态的效果 需要先有继承关系

体现：
1. 父类类型的引用 指向 子类的对象 `Person p = new Teacher();`(自动向上转型 Teacher -> Person)
2. 改引用只能调用父类中定义的属性或方法
3. 如果子类中将父类的方法重写，那么调取方法后执行的结果是子类重写的方法
    1.如果父类与子类有同名的属性，执行父类的属性。
4. 若想要调用子类中独有的成员
    1. （强制类型转化） 造型 铸型 （向上/向下转型）
5. 造型时（强制向下转型时）可能会出现一个运行时异常 ClassCastException
    1. 如果想要避免造型异常 可以用 instanceof 关键字来进行判断

> 异常：
> 1. InputMismatchException 输入不匹配
> 2. NumberFormateException 数字格式化异常
> 3. ArrayIndexOutOfBoundsException 数组索引越界
> 4. NegativeArraySizeException 数组长度负数
> 5. NullPointerException 空指针异常
> 6. ArithmeticException 算数异常 `10/0`
> 7. ClassCastException 造型异常 将对象的类型还原时  与真实类型不匹配
> 8. StackOverFlow 栈内存溢出

