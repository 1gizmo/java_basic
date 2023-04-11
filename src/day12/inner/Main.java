package day12.inner;

public class Main {

    // 내부 클래스 (inner Class)
  private static class SubCalculator implements Calculator{
        @Override
        public int operate(int n1, int n2) {
            return n1 - n2;
        }
    }


    public static void main(String[] args) {


        // 덧셈 계산을 하는 계산기를 만들어서 쓰고싶다
        AddCalculator addCal = new AddCalculator();
        System.out.println(addCal.operate(30, 50));

        // 뺄셈 계산을 하는 계산기가 필요
        SubCalculator subCal = new SubCalculator();
        System.out.println(subCal.operate(100, 40));

        // 곱셈 계산을 하는 계산기가 필요 ( 익명 클래스 )
        Calculator mltiCal = new Calculator() {

            @Override
            public int operate(int n1, int n2) {
                return n1 * n2;
            }
        };

        System.out.println(mltiCal.operate(5, 7));

        // 나눗셈을 하는 계산기 ( 람다 ) : 인터페이스에 추상메서드가 딱 1개일때만 사용가능
        Calculator divCal =
            (n1, n2) -> n1 / n2;
        System.out.println(divCal.operate(50, 10));

        // 1회용 강아지
        Pet dog = new Pet() {
            @Override
            public void eat() {
                System.out.println("강아지는 사료를 먹어요");
            }

            @Override
            public void play() {
                System.out.println("강아지는 마당에서 놀아요");
            }
        };

    }
}
