import java.time.LocalDate;

public class Main {
    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }

    public static String chooseAppVersion(int clientOS, int clientYear) {

        int checkYear = LocalDate.now().getYear();

        String version;
        if (clientYear < checkYear) {
            version = "облегченную";
        } else {
            version = "обычную";
        }

        String osName;
        if (clientOS == 0) {
            osName = "iOS";
        } else {
            osName = "Android";
        }

        return "Установите " + version + " версию приложения для " + osName + " по ссылке";
    }

    public static int calculateDeliveryTime(int distance) {

        int deliveryTime = -1;
        
        int bound1 = 20;
        int bound2 = 60;
        int bound3 = 100;

        if (distance < bound1) {
            deliveryTime = 1;
        } else if (distance < bound2) {
            deliveryTime = 2;
        } else if (distance < bound3) {
            deliveryTime = 3;
        }
        return deliveryTime;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int year = 2022;
        checkLeapYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");

        int oSys = 1;
        int year = 2014;

                if (oSys >= 2) {
            System.out.println("Нет приложения для вашей операционной системы");
        } else {
            System.out.println(chooseAppVersion(oSys, year));
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
                      
        if (deliveryTime > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Сожалеем, в ваш регион доставка невозможна");
        }
    }

}