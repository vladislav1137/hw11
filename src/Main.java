import java.time.LocalDate;


public class Main {

    public static void calculateLeapYear(int year) {
        System.out.println("Задача 1");
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void device(int clientOS, int clientDeviceYear) {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS != 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void deliveryDays(int deliveryDistance) {
        System.out.println("Задача 3");
        if (deliveryDistance < 20) {
            System.out.println("на доставку потребуется 1 день");
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("на доставку потребуется 2 дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("на доставку потребуется 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка свыше 100 км не осуществляется");
        }
    }
        public static void main (String[]args) {
            calculateLeapYear(2021);
            device(1, 2022);
            deliveryDays(95);
        }
    }