package extend;

class Tv {
    boolean power;
    int channel;

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}

public class ExtendExam {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();

        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel); // 11

        stv.displayCaption("Hello, extend"); // 출력되지 않음
        stv.caption = true; // 자막이 true 일 때 println(text)
        stv.displayCaption("Hello, Extend!!!!");
    }
}
