package refertypetrans;

public class ReferTypeTransExam {
    FireEngine f = new FireEngine();

    Car c = (Car) f;
    Car c2 = f; // 자손타입을 조상타입으로 형변환하는 경우 (Car)생략 가능

    FireEngine f2 = (FireEngine) c;

    // 상속관계가 아니기 때문에 클래스 간 형변환 불가
    // Ambulance a = (Ambulance) f; // cannot cast 'FireEngine' to 'Ambulance'
}

class Car {}
class FireEngine extends Car {}
class Ambulance extends Car {}