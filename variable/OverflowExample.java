package variable;

public class OverflowExample {
    public static void main(String[] args) {
        /*
        * 정수의 오버플로우 - 정수 값이 허용된 범위의 최댓값 보다 커지면 오버플로우, 최솟값 보다 작아지면 언더플로우
        * 해결 방안은 정수 타입의 크기를 확인하여 알맞는 크기의 자료형을 선택할 것
        * */
        byte a = 127;
        a++;
        System.out.println(a); //byte의 범위는 -128 ~ 127로 127에서 오버플로우 되어 -128로 넘어가게 됨

        byte b = -128;
        b--;
        System.out.println(b); //-128에서 언더플로우 되어 127로 넘어감

        byte c = 127;
        System.out.println(a+c); // 127 + 127의 기대값은 254지만 overflow가 일어나 -1
    }
}
