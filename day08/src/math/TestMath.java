package math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.UUID;

public class TestMath {
    public static void main(String[] args) {
//        System.out.println(Math.ceil(1.5));
//        System.out.println(Math.floor(1.5));
//        System.out.println(Math.rint(1.5));
//        System.out.println(Math.round(1.5));

//        Random r = new Random();
//        int value = r.nextInt(); // 随机产生一个整数
//        System.out.println(value);
//
//        int result = r.nextInt(10);
//        System.out.println(result);
//
//
//        float f = r.nextFloat();
//        System.out.println(f);
//
//        UUID uuid = UUID.randomUUID();
//        System.out.println(uuid.toString()); // 数据库表格主键 primary key

        TestMath tm = new TestMath();
        BigInteger result = tm.factorial(500);
        System.out.println(result);


        BigDecimal decimal = new BigDecimal("123.456");
        // 小数点之后保留两位 向下取整
        decimal = decimal.setScale(2, BigDecimal.ROUND_DOWN);
        System.out.println(decimal);

        DecimalFormat df = new DecimalFormat("000.###"); // 0
        String value = df.format(1123.4516);
        System.out.println(value);
    }

    public BigInteger factorial(int num) {
        BigInteger result = new BigInteger("1");
        BigInteger tmp = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
