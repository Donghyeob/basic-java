package abstractEx;

abstract class abstractMethodExam extends Player {
    void play(int pos) {} // 추상 메서드 구현
}

abstract class Player {
    abstract void play(int pos); // 추상 메서드 선언부
    abstract void stop(); // 추상 메서드 선언부
}

class AudioPlayer extends Player {
    void play(int pos) {} // 추상 메서드 구현
    void stop() {} // 추상 메서드 구현
}