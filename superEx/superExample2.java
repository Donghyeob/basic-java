package superEx;

public class superExample2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}

class Parent2 { int x = 10; }

class Child2 extends Parent2 {

    void method() {
        System.out.println("x : " + x); // x : 10
        System.out.println("this x : " + this.x); // this x : 10
        System.out.println("super x : " + super.x); // super x : 10
    }
}