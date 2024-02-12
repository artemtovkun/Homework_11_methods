public class Main
{
    private static void task1 (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Год " + year + " - является високосным");
        } else {
            System.out.println("Год " + year + " - не является високосным");
        }
    }
    private static void task2 (int clientOS1, int clientDeviceYear) {
        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    private static void task3 (int deliveryDistance) {
        if (deliveryDistance >= 0 && deliveryDistance <= 20) {
            System.out.println("Ваше расстояние составляет " + deliveryDistance + " км. Доставка в пределах 20 км займет 1 сутки");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Ваше расстояние составляет " + deliveryDistance + " км. Доставка в пределах 60 км займет 2 суток");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Ваше расстояние составляет " + deliveryDistance + " км. Доставка в пределах 100 км займет 3 суток");
        } else {
            System.out.println("Ваше расстояние составляет " + deliveryDistance + " км. Доставка на такое расстояние не осуществляется (свыше 100 км) или Вы ввели отрицательное число");
        }
    }
    public static void main(String[] args) {
        // Задача 1

        task1 (1561);
        task1 (1999);
        task1 (2016);
        // Задача 2

        task2 (0, 2014);
        task2(1, 2020);
        // Задача 3

        task3 (99);
        task3 (8);
        task3 (47);
        task3 (-5);

    }
}
