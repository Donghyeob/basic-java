package objectInstance;

import java.util.Arrays;

public class CreateInstance {
    public static void main (String[] args) {
        class Tv {

            String color;
            boolean power;
            int channel;

            void power() {
                power = !power;
            }
            void channelUp() {
                channel++;
            }
            void channelDown() {
                channel--;
            }
        }

        Tv t;
        t = new Tv();
        t.channel = 7;
        t.channelDown();
        System.out.println(t.channel); // 6

        /**
         * t와 t2라는 참조변수엔 할당된 메모리의 주소를 각각 갖고있음
         * t2에 t를 저장하면 t2는 t의 메모리 주소를 참조하게 됨
         * 때문에 t를 변경하면 t2도 변경됨
         * 이처럼 여러개의 참조변수가 하나의 인스턴스를 가리키는 것은 가능
         * 하나의 참조변수가 여러개의 인스턴스를 가리키는 것은 불가능
         */
        Tv t2 = new Tv();
        t2 = t;
        t.channel = 7;
        System.out.println(t2.channel);
    }
}
