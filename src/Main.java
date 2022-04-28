public class Main {
    public static void main(String[] args) {

        System.out.println("Hello");

        int sum = 200;
        int amount = 4000;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int ollSum = sum + amount + bonus ;
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговый счет: " + ollSum);
    }
}
