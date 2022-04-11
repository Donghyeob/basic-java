package polymorphism;

public class ParamPolymorphism {

}

class Product {
    int price;
    int bonusPoint;
}

class Phone extends Product {}
class Computer extends Product {}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

//    void buy(Phone p) {
//        money = money - p.price;
//        bonusPoint = bonusPoint + p.bonusPoint;
//    }
//
//    void buy(Computer c) {
//        money = money - c.price;
//        bonusPoint = bonusPoint + c.bonusPoint;
//    }

    void buy(Product p) {
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
    }
}