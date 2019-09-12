package innerclass;

public class Demo {
    private String name = "这是正常类中的属性";

    public void testDemo() {
        System.out.println("这是正常类中的方法");
    }

    public void testDemoOne() {
        // 定义一个局部类
        class InnerTestOneMethod {

        }
    }

    public void testDemoTwo() {
        // 定义一个局部类
        class InnerTestOneMethod {

        }
    }


    public class InnerDemo {
        private String name = "这是内部类中的属性";

        public void testInnerDemo() {

            System.out.println("这是内部类的方法" + Demo.this.name);
            System.out.println("这是内部类的方法" + this.name);
            testDemo();
        }
    }

    // 静态内部类

    public static class InnerStatic {

    }
}
