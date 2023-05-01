public class Main {
    public static void main(String[] args) {
        int depositIn = 100;// начальный депозит
        int amount = 100; // сумма пополнения
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int balance = depositIn + amount + bonus;
        System.out.println("Ваш баланс равен: " + balance + " руб");
        System.out.println("Количество бонусов: " + bonus + " руб");
    }
}
