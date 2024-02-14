public class Main
{
    public static void main(String[] args) {
        // Задача 1
        checkingYearLeap (1561);
        checkingYearLeap (1999);
        checkingYearLeap (2016);
        // Задача 2
        recommendedVersionOfApplication (0, 2014);
        recommendedVersionOfApplication(1, 2020);
        // Задача 3
        int deliveryDays = calculateDeliveryDistanceAndDay (99);
        if (deliveryDays  > 0) {
            System.out.println(STR."Потребуется дней для доставки: \{deliveryDays}");
        } else {
            System.out.println("Доставки нет");
        }
    }
    private static void checkingYearLeap (int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(STR."Год \{year} - является високосным");
        } else {
            System.out.println(STR."Год \{year} - не является високосным");
        }
    }
    private static void recommendedVersionOfApplication (int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    private static int calculateDeliveryDistanceAndDay (int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        return deliveryDays;
    }
}
