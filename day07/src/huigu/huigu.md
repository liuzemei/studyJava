知识回顾

    适配器模式 Adapter ---- 结构型模式的一种
    缺省适配器模式
    解决一个借口（规则）定义了好多方法
    适配器（通常是一个抽象类）  添加某些具体实现（方法内部抛出异常）
    每一个子类实现接口 所有的方法
    

多态
    
    多态指的是一个对象体现出的多种不同的形态（身份），可以将同一种行为表现出不同的效果
    多态的表现形式：
    1. 多态的前提需要有几成关系
    2. 使用父类类型的引用 指向子类的对象 Person p = new Teacher(); -- 向上转型
    3. 改引用只能调用父类中定义的属性/方法
    4. 执行结果：如果调用属性 则执行父类的 如果调用的是方法，看子类是否重写
    5. 若想要调用子类中独有的成员 将身份还原回去（造型 -- 向下转型）
        若需要转换的类型与真实对象的类型不匹配 会产生一个运行时异常 ClassCastException
    6. 为了避免转型时产生的问题 可以利用 instanceof 进行判断比较
        比较前面对象和 和 后边类型是否匹配   p instanceof Teacher
---
小练习

    银行 Bank
    设计一个方法 等待用户来办理业务Profession
    1. 叫一个号码： -》   排队
    2. 去窗口办理 -》 办理
    3. 办理完毕离开 -》 离开