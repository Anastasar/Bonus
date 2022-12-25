public class Main {
    public static void main(String[] args) {
        int intialAccount = 100;
        int depositAmount = 2000;

        if (depositAmount > 1000) {
            System.out.println("Сумма бонуса составит:     " + depositAmount / 100);
            System.out.println("Итоговая сумма счета составит:        " + (intialAccount + depositAmount + depositAmount / 100));
        } else {
            System.out.println("Сумма бонуса составит: 0 рублей");
            System.out.println("Итоговая сумма счета составит:        " + (intialAccount + depositAmount));
        }

    }
}