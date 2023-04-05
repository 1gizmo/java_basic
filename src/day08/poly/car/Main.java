package day08.poly.car;

import day07.protec.Util.Utility;

import static day07.protec.Util.Utility.*;

public class Main {
    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        park.drive(new Mustang());
        park.drive(new Stinger());
        park.drive(new Tucson());

        makeLine();
        Mustang mustang = new Mustang();
        mustang.accelerate();
        mustang.powerSound();

        Stinger stinger = new Stinger();
        stinger.accelerate();

        Car car = shop.exportCar(6000);
        System.out.println(car instanceof Stinger);
        System.out.println(car instanceof Tucson);
        System.out.println(car instanceof Mustang);

//        System.out.println("car = " + car);

//        car.powerSound();




    }

}
