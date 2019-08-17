package classRalation.contains;

public class Run {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.brand = "宝马";
//        car.type = "Z4";
//        car.color = "宝石蓝色";
//        car.wheel = new Wheel();
//        car.wheel.brand = "米其林";
//        car.wheel.color = "酷黑";
        Car car = new Car("宝马","Z4","宝石蓝色",new Wheel("米其林",10,"酷黑"));
        car.showCar();
    }
}
