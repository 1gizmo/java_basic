package day10.friends;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        People kim = new People("김철수");
        People park = new People("박영희");
        People hong = new People("홍길동");

        kim.addFollowerWaitList(park);
        kim.addFollowerWaitList(hong);

//        kim.addFollower(park);

        List<String> kimWaitList = kim.showFollowerWaitPerson();
        System.out.println("kimWaitList = " + kimWaitList);

        List<String> followerNames = kim.showFollower();
        System.out.println("followerNames = " + followerNames);

    }
}