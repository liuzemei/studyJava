package rely;

public class Farmar {

    // 农夫养猪 -->
    // 参数 --> 几个月   返回值 --> 猪

    public Pig feedPig(int month) {
        Pig pig = new Pig("小花"); // 依赖 --> 在屠夫的方法中使用到了猪的对象
        pig.growUp(month);
        return pig;
    }
}
