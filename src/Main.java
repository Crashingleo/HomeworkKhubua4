public class Main {
    public static void main(String[] args) {


        // Zadacha 1 //
        System.out.println(" Задача 1 ");
        byte isIos = 0;
        if (isIos == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Zadacha 2 //
        System.out.println( "Задача 2");
        int  clientDeviceYear = 2015;
        if ( isIos == 1)
        {
            if (clientDeviceYear < 2015)
            {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else
            {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else
        {
            if (clientDeviceYear < 2015)
            {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            } else
            {
                System.out.println("Установите облегченную версию приложения для ANDROID по ссылке");
            }
        }

        // Zadacha 3 //
        System.out.println("Задача 3");
        int year = 700;
        if (year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0 ){
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не високосный");
        }

        // Zadacha 4 //
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance <= 60){
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance <= 100){
            System.out.println("Потребуется дней: 4");
        } else System.out.println("Доставки нет");

        // Zadacha 5 //
        System.out.println("Задача 5");
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }

        // Zadacha 6 //
        System.out.println("Задача 6");


    }
}