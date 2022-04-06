package modifier;

public class FinalExample extends FinalExam { // Cannot inherit from final
    public static void main(String[] args) {
        System.out.println(FinalExam.WIDTH); // 200
    }
}

final class FinalExam { // 클래스
    static int WIDTH = 200; // 멤버 변수

    final int getMaxSize() { // 메서드
        WIDTH = 100;
        final int WD = WIDTH; // 지역 변수
        return WIDTH;
    }
}