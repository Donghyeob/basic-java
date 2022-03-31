package superEx;

public class SuperConstructor {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        System.out.println("x : " + p.x + ", y : " + p.y + ", z : " + p.z); // x : 1, y : 2, z : 3
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y; // 같은 클래스의 다른 생성자 초기화
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y); // Point(int x, int y) 호출, 조상의 멤버를 초기화
        this.z = z;
    }
}