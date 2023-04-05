package day08.poly.car;

// 자동차 판매 대리점
public class CarShop {

    Car[] cars;

//    Mustang[] mustangs;
//    Stinger[] stingers;
//    Tucson[] tucsons;

    // 대리점에 차를 입고하는 기능
    public void importCar(){

        cars = new Car[] {
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson()
        };
        // 문자열과 정수와 논리를 배열에 담을 수 있는가 ?
        Object[] oArr = {
                50,30,40,3.3,"zzzz",false,
                new Mustang()
        };
    }



}
