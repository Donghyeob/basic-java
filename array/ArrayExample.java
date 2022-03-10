package array;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        /*
        * 배열(array)이란 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
        * 많은 양의 값(데이터)을 다룰 때 유용하며 배열의 각 요소는 서로 연속적이다.
        *
        * 배열 선언 - 참조 변수 선언
        * Type[] name;
        * Type name[];
        * 배열 생성 - 저장 공간 생성
        * name = new Type[];
        * */

        int[] a = new int[5];
        System.out.println(Arrays.toString(a)); // 배열은 참조 변수이기 때문에 string으로 변환 후 출력 가능

        int b[];
//        System.out.println(Arrays.toString(b)); // Variable 'b' might not have been initialized
        b = new int[5];
        System.out.println(Arrays.toString(b));

        /*배열 초기화
        * 배열의 index는 0부터 시작
        * */
        b[0] = 1;
        b[1] = 2;
        System.out.println(Arrays.toString(b));

        int[] c = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(c));
        System.out.println(c.length); // 배열의 길이 출력

        /*int 형 배열이기 때문에 하나의 index는 int 형을 가지고 있음*/
        int d = c[3];
        System.out.println(d);

        /*다차원 배열*/
        int[][] e = new int[][] {{1, 2}, {3, 4}, {5, 6}}; // new int[3][2]
        for (int i = 0; i < e.length; i++){
            System.out.println(Arrays.toString(e[i]));
        }

        /*가변 배열
        * 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정
        * */
        int[][] f = new int[3][];
        f[0] = new int[4];
        f[1] = new int[3];
        f[2] = new int[5];
        for (int i = 0; i < e.length; i++){
            System.out.println(Arrays.toString(f[i]));
        }

        /*배열의 복사*/
        int[] g = new int[8];
        for(int i = 0; i < c.length; i++){
            g[i] = c[i];
        }
        System.out.println(Arrays.toString(g)); // [1, 2, 3, 4, 5, 0, 0, 0]

        int[] h = new int[8];
        System.arraycopy(c, 0, h, 3, 5);
        // System.arraycopy(C 배열의, 0번째 index 부터 복사하여, h배열의, 3번째 index 부터 붙여넣기, C배열 0번째 부터 5개의 index를)
        System.out.println(Arrays.toString(h));
    }
}
