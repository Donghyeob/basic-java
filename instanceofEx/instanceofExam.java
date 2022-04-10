package instanceofEx;

public class instanceofExam {
    void test(Tv t) {
        if (t instanceof SmartTv) { // 형변환 가능 여부 판단
            SmartTv st = (SmartTv) t; // 형변환
            st.power();
        };
    }
}

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class SmartTv extends Tv {
    String text;
    void caption() {}
}