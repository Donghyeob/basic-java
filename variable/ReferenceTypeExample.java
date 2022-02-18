package variable;

public class ReferenceTypeExample {
    public static void main(String[] args) {

        /*Reference type은 참조 값을 힙 메모리에 저장 */
        Object obj = new Object();
        System.out.println(obj.getClass().getName());
        int[] arr = new int[5];
        System.out.println(arr.getClass().getName());
    }
}
