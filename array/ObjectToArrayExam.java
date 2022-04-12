package array;

public class ObjectToArrayExam {
    public static void main(String[] args) {
        Product p1 = new Phone();
        Product p2 = new Computer();

        Product p[] = new Product[2];
        p[0] = new Phone();
        p[1] = new Computer();
    }
}

class Product {
    int price;
    int bonusPoint;
}

class Phone extends Product {};
class Computer extends Product {};

class Buyer {
    int price = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (price < p.price) {
            System.out.println("잔액 부족");
            return;
        }

        price -= p.price;
        bonusPoint += p.bonusPoint;
        Product product = cart[i++] = p;
        System.out.println(p + " 구매 완료");
    }
}