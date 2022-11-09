public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 3;
        byte b = 13;
        short c = 23;
        long d = 33;
        float f = 43;
        double g = 53.3333333;
        System.out.println("Значение переменной a с типом int равно " +a);
        System.out.println("Значение переменной b с типом byte равно " +b);
        System.out.println("Значение переменной c с типом short равно " +c);
        System.out.println("Значение переменной d с типом long равно " +d);
        System.out.println("Значение переменной f с типом float равно " +f);
        System.out.println("Значение переменной g с типом double равно " +g);
        System.out.println("Задание 2");
         double a2 = 27.12;
         String b2 = "987 678 965 549";
         byte c2 = 2;
         short d2 = 786;
         boolean f2 = false;
         short g2 = 569;
         short  q2 =  -159;
         short r2 =  27897;
         byte t2 = 67;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(f2);
        System.out.println(g2);
        System.out.println(q2);
        System.out.println(r2);
        System.out.println(t2);
        System.out.println("Задание 3");

        byte kinderLP = 23;
        byte kinderAS = 27;
        byte kinderEA = 30;
        int totalSheetsOfPaper = 480;
        float allKinder = kinderAS + kinderEA + kinderLP;
        float kinderOfPaper = allKinder / totalSheetsOfPaper;
        System.out.println("На каждого ученика рассчитано " +kinderOfPaper+ " листов бумаги");
        System.out.println("Задание 4");
        int numberOfBottles = 16;
        int timeWorker = 2;
        int numberOfBottles1min = numberOfBottles / timeWorker;
        System.out.println("За 1 мин, машины произвела бутылок в колличестве " + numberOfBottles1min + " штук");
        int numberOfBottles20min = numberOfBottles1min * 20; //20 мин
        System.out.println("За 20 мин, машины произвела бутылок в колличестве " + numberOfBottles20min + " штук");
        int numberOfBottles1day = (numberOfBottles1min * 60) * 24 ;// 24 часа
        System.out.println("За сутки, машины произвела бутылок в колличестве " + numberOfBottles1day + " штук");
        int numberOfBottles3day = numberOfBottles1day * 3; // 3 дня
        System.out.println("За 3 дня, машины произвела бутылок в колличестве " + numberOfBottles3day + " штук");
        int numberOfBottles1month = numberOfBottles1day * 31; // 31 дня
        System.out.println("За 1 месяц, машины произвела бутылок в колличестве " + numberOfBottles1month + " штук");
        System.out.println("Задание 6");
        float bananas = 5 * 80;
        float milk = 2 * 105;
        float iceCream = 2 * 100;
        float egg = 4 * 70;
        float breakfast = bananas + milk + iceCream + egg;
        float breakfastKg = breakfast / 1000;
        System.out.println("Вес завтрака состовляет " + breakfast + " грамм, или " + breakfastKg + " кг");
        System.out.println("Задание 7");
        int weightKg = 7;
        int weightG = 7 * 1000;
        int diet1 = 250;
        int diet2 = 500;
        int dietResult1 = weightG / diet1;
        int dietResult2 = weightG / diet2;
        System.out.println("Для похудения на " + weightKg + " кг, импользуя диету 1, потребуется " + dietResult1 + " дней" );
        System.out.println("Для похудения на " + weightKg + " кг, импользуя диету 2, потребуется " + dietResult2 + " дней" );
        System.out.println("Задание 8");

        // Маша
        int Masha = 67760;
        double MashaUp = (Masha * 0.1) + Masha; // Новая ставка
        double MashaYearOld = Masha * 12; // Годовая ЗП по старой ставки
        double MashaYearNew = MashaUp * 12; // Годовая ЗП по новой ставки
        double MashaYearDifference = MashaYearNew - MashaYearOld; // разница
        System.out.println("Маша теперь получает " + MashaUp + " рублей. Годовой доход вырос на " + MashaYearDifference + " рублей");

        // Денис
        int Denis = 83690;
        double DenisUp = (Denis * 0.1) + Denis; // Новая ставка
        double DenisYearOld = Denis * 12; // Годовая ЗП по старой ставки
        double DenisYearNew = DenisUp * 12; // Годовая ЗП по новой ставки
        double DenisYearDifference = DenisYearNew - DenisYearOld; // разница
        System.out.println("Денис теперь получает " + DenisUp + " рублей. Годовой доход вырос на " + DenisYearDifference + " рублей");
        // Кристина
        int Kristina = 76230;
        double KristinaUp = (Kristina * 0.1) + Kristina; // Новая ставка
        double KristinaYearOld = Kristina * 12; // Годовая ЗП по старой ставки
        double KristinaYearNew = KristinaUp * 12; // Годовая ЗП по новой ставки
        double KristinaYearDifference = KristinaYearNew - KristinaYearOld; // разница
        System.out.println("Кристина теперь получает " + KristinaUp + " рублей. Годовой доход вырос на " + KristinaYearDifference + " рублей");


    }


    }
