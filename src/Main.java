public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int apples = 1500;
        byte carrots = 10;
        short cucumbers = 123;
        long potatoes = 23456L;
        float vodka = 1.5f;
        double sugar = 1.75;
        System.out.println("Значение переменной apples с типом int равно " + apples);
        System.out.println("Значение переменной carrots с типом byte равно " + carrots);
        System.out.println("Значение переменной cucumbers с типом short равно " + cucumbers);
        System.out.println("Значение переменной potatoes с типом long равно " + potatoes);
        System.out.println("Значение переменной vodka с типом float равно " + vodka);
        System.out.println("Значение переменной sugar с типом double равно " + sugar);

        System.out.println("Задание 2");

        byte a = 67;
        short b = -159;
        int c = 569;
        int d = 27897;
        long e = 987678965549L;
        float f = 27.12f;
        double g = 2.786;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом int равно " + d);
        System.out.println("Значение переменной e с типом long равно " + e);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной g с типом double равно " + g);

        System.out.println("Задание 3");

        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short papers = 480;
        int allStudents = lpStudents + asStudents + eaStudents;
        int papers1Students = papers / allStudents;
        System.out.println("На каждого ученика рассчитано " + papers1Students + " листов бумаги");

        System.out.println("Задание 4");

        byte bottle2Minutes = 16;
        int bottle1Minutes = bottle2Minutes / 2;
        int bottle20Minutes = bottle1Minutes * 20;
        int bottle1day = bottle1Minutes * 1440;
        int bottle3days = bottle1day * 3;
        int bottle1month = bottle1day * 30;
        System.out.println("За 20 минут машина произвела " + bottle20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle1day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle3days + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottle1month + " штук бутылок");

        System.out.println("Задание 5");

        short paint = 120;
        byte white = 2;
        byte brown = 4;
        int paint1Room = white + brown;
        int totalRooms = paint / paint1Room;
        int needWhite = totalRooms * white;
        int needBrown = totalRooms * brown;
        System.out.println("В школе, где " + totalRooms + " классов, нужно " + needWhite + " банок белой краски и " + needBrown + " банок коричневой краски");

        System.out.println("Задание 6");

        byte bananas = 5;
        byte weight1Bananas = 80;
        int weightBananas = bananas * weight1Bananas;
        short milk = 200;
        byte weight100Milk = 105;
        int weightMilk = milk / 100 * weight100Milk;
        byte iceCream = 2;
        byte weight1IceCream = 100;
        int weightIceCream = iceCream * weight1IceCream;
        byte eggs = 4;
        byte weight1Eggs = 70;
        int weightEggs = eggs * weight1Eggs;
        int totalWeight = weightBananas + weightMilk + weightIceCream + weightEggs;
        double weightKilo = totalWeight * 0.001;
        System.out.println("Общая масса спортзавтрака " + totalWeight + " в граммах, " + weightKilo + " в килограммах");

        System.out.println("Задание 7");

        byte loseWeight = 7;
        int loseWeightGram = loseWeight * 1000;
        short loseMin = 250;
        short loseMax = 500;
        int daysMax = loseWeightGram / loseMin;
        int daysMin = loseWeightGram / loseMax;
        int mayBeDays = (daysMax + daysMin) / 2;
        System.out.println(daysMax + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(daysMin + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("в среднем для похудения нужно " + mayBeDays + " дней");

        System.out.println("Задание 8");

        int maryCash = 67760;
        int danCash = 83690;
        int krisCash = 76230;
        int maryCash2 = maryCash / 10 + maryCash;
        int danCash2 = danCash / 10 + danCash;
        int krisCash2 = krisCash / 10 + krisCash;
        int differenceMaryCash = maryCash2 * 12 - maryCash * 12;
        int differenceKrisCash = krisCash2 * 12 - krisCash * 12;
        int differenceDanCash = danCash2 * 12 - danCash * 12;
        System.out.println("Маша теперь получает " + maryCash2 + " рублей. Годовой доход вырос на " + differenceMaryCash + " рублей");
        System.out.println("Денис теперь получает " + danCash2 + " рублей. Годовой доход вырос на " + differenceDanCash + " рублей");
        System.out.println("Кристина теперь получает " + krisCash2 + " рублей. Годовой доход вырос на " + differenceKrisCash + " рублей");
    }
}