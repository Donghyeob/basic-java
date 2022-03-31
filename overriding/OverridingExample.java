package overriding;

public class OverridingExample {
    public static void main(String[] args) {
        class Point {
            int x = 1;
            int y = 2;

            String getLocation() {
                return "x : " + x + ", y : " + y;
            }
        }

        class Point3D extends Point {
            int z = 3;

            String getLocation() {
                return "x : " + x + ", y : " + y + ", z : " + z; // 오버라이딩 getLocation() 반환 값에 ", z : " + z를 추가
            }
        }

        System.out.println(new Point3D().getLocation());
    }
}
