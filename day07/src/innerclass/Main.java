package innerclass;

import innerclass.Demo.InnerDemo;

public class Main {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo.InnerDemo innerDemo = demo.new InnerDemo();
        InnerDemo a = demo.new InnerDemo();
        innerDemo.testInnerDemo();
    }
}
