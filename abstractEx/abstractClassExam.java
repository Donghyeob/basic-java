package abstractEx;

public class abstractClassExam {
    public static void main(String[] args) {
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new SiegeTank();
//        group[2] = new Dropship();

        Unit[] group = {new Marine(), new SiegeTank(), new Dropship()};

        for(int i = 0; i < group.length; i++) {
            group[i].move(100,200);
        }
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {}
}

class Marine extends Unit {
    void move(int x, int y) {};
    void stimPack() {};
}

class SiegeTank extends Unit {
    void move(int x, int y) {};
    void siegeMode() {};
}

class Dropship extends Unit {
    void move(int x, int y) {};
    void drop() {};
    void lift() {};
}