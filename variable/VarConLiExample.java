package variable;

public class VarConLiExample {

    public static void main(String[] args) {
        /*
         * 변수(Variable) - 하나의 값을 저장하기 위한 공간
         * 상수(Constant) - 한 번만 값을 저장할 수 있는 공간
         * 리터럴(Literal) - 그 자체로 값을 의미하는 것
         * */
        int a = 369;
        a = 3;
        final int b = 30;
        // b = 22; // Cannot assign a value to final variable 'b' 상수는 변경 불가

        /*리터럴, 프로그램에서 직접 표현한 표현하여 그 자체로 값을 의미함*/
        int c = 10; // 10, "" 10진수
        int d = 010; // 8, "0" 8진수
        int e = 0x10; // 16, "0x" 16진수
        int f = 0b10; // 2, "0b" 2진수
        long g = 10L; // "L" Long

        float h = 3.1415f; // "F" Float
        double i = 3.1415; // "" or "D" Double

        char j = 'A';
        char k = '\uc720'; // "\\u" unicode
        char l = 65; // ascii

        String m = "String"; // any type + String = String
//        System.out.println(m+c); // String
//        System.out.println(m+j); // String

        boolean n = 1 > 0; // true
//        boolean o = 0; // 0으로 참, 거짓을 판별할 수 없음

//        int p = null;
        String q = null;
    }
}