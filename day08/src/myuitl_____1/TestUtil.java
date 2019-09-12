package myuitl_____1;

public class TestUtil {
    public static void main(String[] args) {
        int value = Integer.parseInt("123");

        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println(i1 == i2);
        System.out.println(i3 == i2);
        System.out.println(i4 == i2);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i1.equals(i4));
    }
}
