package staticmethod;

class Math1 {
    long a, b;

    /*인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.*/
    long add() { return a + b; } // a, b는 인스턴스 변수
    long subtract() { return a - b; }
    long multiply() { return a * b; }
    double divide() { return a / b; }

    /*인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.*/
    static long add(long a, long b) { return a + b; } // a, b는 지역변수
    static long subtract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double divide(long a, long b) { return a / (double)b; }
}

class StaticExample {
    public static void main(String[] args) {
        /*클래스 메서드 호출, 인스턴스 생성없이 호출가능*/
        System.out.println(Math1.add(200L, 100L));
        System.out.println(Math1.subtract(300L, 100L));
        System.out.println(Math1.multiply(10L, 30L));
        System.out.println(Math1.divide(1000L, 10L));

        Math1 m1 = new Math1(); // 인스턴스 생성
        m1.a = 100L;
        m1.b = 200L;

        /*인스턴스 메서드는 객체생성 후에만 호출이 가능하다.*/
        System.out.println(m1.add());
        System.out.println(m1.subtract());
        System.out.println(m1.multiply());
        System.out.println(m1.divide());
    }
}