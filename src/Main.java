public class Main {
    public static void main(String[] args) {
        int intial_account = 100;
        int deposit_amount = 2000;

        if (deposit_amount > 1000) {
            System.out.println("Сумма бонуса составит:     " + deposit_amount / 100);
            System.out.println("Итоговая сумма счета составит:        " + (intial_account + deposit_amount + deposit_amount / 100));
        } else {
            System.out.println("Сумма бонуса составит: 0 рублей");
            System.out.println("Итоговая сумма счета составит:        " + (intial_account + deposit_amount));
        }

    }
}