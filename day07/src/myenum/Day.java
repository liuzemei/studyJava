package myenum;

public enum Day {
    // 描述了七个当前类的对象
    monday("星期一", 1), tuesday, wednesday, thursday, firday, saturday, sunday;

    private String name;
    private int index;

    private Day() {
    }

    private Day(String name, int index) {
        this.name = name;
        this.index = index;
    }

}
