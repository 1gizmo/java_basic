package day04.array;

public class Main {
    public static void main(String[] args) {


//        StringList foodList = new StringList();
        StringList foodList = new StringList("짬뽕","짬뽕밥");
        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");

        StringList userNmaeList = new StringList();
        userNmaeList.push("김철수");
        userNmaeList.push("박영희");

        foodList.pop();

        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());

        System.out.println("userNmaeList = " + userNmaeList);
        System.out.println("userNmaeList.size() = " + userNmaeList.size());
    }
}
