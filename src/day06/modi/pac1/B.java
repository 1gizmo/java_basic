package day06.modi.pac1;

class B { // default 제한 : 클래스에는 public과 default만 사용가능

    public int x1;
    int x2;
    private int x3;


    void test() {
        A a = new A(); // public
        new A(10); // default
//        new A("zzzz"); // private


        a.f1 = 1;  // public
        a.f2 = 2;  // default
//        a.f3 = 3;  // private

        a.m1(); // public
        a.m2(); // default
//        a.m3(); // private
    }
}
