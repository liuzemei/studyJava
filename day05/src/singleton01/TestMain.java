package singleton01;

public class TestMain {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getSingleTon();
        SingleTon s2 = SingleTon.getSingleTon();
        System.out.println(s1);
        System.out.println(s2);
        s1 = null;
        System.out.println(s1);
        System.out.println(s2);


    }
}
