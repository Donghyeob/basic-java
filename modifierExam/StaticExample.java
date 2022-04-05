package modifierExam;

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(StaticExam.max(1,2));
    }
}

class StaticExam {
    static int width = 200; // 멤버 변수
    static int height = 100;

    static {
        // 초기화 블럭
    }

    static int max(int a, int b) { // 메서드
        return Math.max(a, b);
    }
}