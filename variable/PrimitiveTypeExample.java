package variable;

public class PrimitiveTypeExample {
    public static void main(String[] args) {

        /*8bit -> 1byte
        * 1byte -> 256 크기 저장 가능*/
        /*Primitive type은 실제 값을 메모리에 저장*/

        /*논리형 - 조건식과 논리적 계산에 사용(1byte)*/
        Boolean trueOrFalse = true;

        /*문자형 - 변수 당 하나의 문자만을 저장(2byte)
        * char charVar ('') single quote로 감싸야하며 아래와 같은 문자열은 안됨
        * ex) 'abcd', "a", ...*/
        char charVar = 'c';

        /*정수형 - 주로 int(4byte) & long(8byte)을 사용하며
        *   byte(1byte)는 이진 데이터를 다루는데 사용
        *   short(2byte)는 c언어와의 호환을 위해 추가
        *   ex) int(4byte) = 2^x, x = 8(bit) * 4(byte) = 32, 2^32 -> 4,294,967,296
        *       음수 영역까지 포함하여 -2,147,483,648 ~ 2,147,483,647*/
        byte byteVar = -128; // -128 ~ 127
        short shortVar = 32767; //  -32,768 ~ 32,767
        int intVar = 2147483647;

        /*long longVar = 9223372036854775807; -> Integer number too large
        *   변수 longVar에 저장하기 전에 임시로 메모리에 저장되는데 저장 시 사용하는 기본 데이터 타입이 int이기 때문에
        *   L을 붙여 long 타입임을 알려주면 에러가 사라짐*/
        long longVar = 9223372036854775807L;

        /*실수형 - 실수 값을 저장*/
        float floatVarMin = 3.14F;
    }
}
