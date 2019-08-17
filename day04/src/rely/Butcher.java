package rely;

public class Butcher {
    // 属性 名字 有刀

    // 方法
    // 描述一个屠夫杀猪的方法 需要提供条件 一头猪
    public void killPig(Pig pig) {
        System.out.println(pig.name + "的体重为：" + pig.weight);
        pig.beKilled();
    }

}
