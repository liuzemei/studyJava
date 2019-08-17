package rely;

public class Pig {

    // 属性
    public String name; // 名字
    public int weight = 20; // 体重

    // 构造方法
    public Pig() {
    }

    public Pig(String name) {
        this.name = name;
    }


    // 方法
    public void beKilled() {
        System.out.println(name + "被杀了，好惨啊");
    }

    // 描述一个方法 让猪长肉
    // 每一个月涨到前一个月的两倍
    public void growUp(int month) {
        this.weight = (int) (weight << month);
    }

    // 猪告知他的体重
    public int getWeight() {
        return this.weight;
    }

    // 猪告知他的名字
    public String getName() {
        return this.name;
    }

}
