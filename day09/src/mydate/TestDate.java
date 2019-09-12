package mydate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        // 1970-1-1 00:00:00 (中国在+8时区)   -> 1970-1-1 00:08:00
        System.out.println(time);

        Date time1 = new Date(); // 默认就是用当前的系统时间构建的date对象
        Date time2 = new Date(1568252815670L);
        System.out.println(time1);
        System.out.println(time2);

        boolean x = time1.before(time2);
        boolean y = time1.after(time2);
        System.out.println(x + "----" + y);

        time1.setTime(1568252815670L);
        long time3 = time2.getTime();
        System.out.println(time3);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String a = sdf.format(time3);
        System.out.println(a);


        Calendar calendar = Calendar.getInstance(); // 系统当前时间的calendar对象

        calendar.set(Calendar.YEAR, 2015);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + "--" + month + "--" + day);

    }
}
