package variable;

public class ReferenceTypeExample {
    public static void main(String[] args) {

        /*Reference type은 참조 값을 힙 메모리에 저장, 크기가 동적인 것들이 저장됨
        * 직접 값을 담고있지 않고 값을 가리키는 주소를 담고있음
        * object, class, array, interface, enum, 등
        * 보통 new 키워드를 이용하여 객체를 생성해 데이터가 생성된 주소를 참조함
        *   String 제외*/

        Object obj = new Object();
        int[] arr = new int[5];
        String str = "AaBbCcDd";

    }
}
