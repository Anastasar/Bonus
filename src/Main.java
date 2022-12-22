public class Main {
    public static void main(String[] args) {
        int x= 100;
        int i= 100;

        if (i > 1000) {
            System.out.println("Сумма бонуса составит:     " + i / 100);
            System.out.println("Итоговая сумма счета составит:        " + (x + i + i / 100));
        } else {
            System.out.println("Сумма бонуса составит: 0 рублей");
            System.out.println("Итоговая сумма счета составит:        " + (x + i));
        }

    }
}