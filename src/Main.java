public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 3;
        byte b = 13;
        short c = 23;
        long d = 33_44_55_66L;
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
         long b2 = 987_678_965_549L;
         float c2 = 2.786F;
         boolean f2 = false;
         char g2 = 569;
         short  q2 =  -159;
         int r2 =  27897;
         byte t2 = 67;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(f2);
        System.out.println(g2);
        System.out.println(q2);
        System.out.println(r2);
        System.out.println(t2);
        System.out.println("Задание 3");

        int kinderLP = 23;
        int kinderAS = 27;
        int kinderEA = 30;
        int totalSheetsOfPaper = 480;
        int allKinder = kinderAS + kinderEA + kinderLP;
        int kinderOfPaper = totalSheetsOfPaper / allKinder ;
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
        System.out.println("Задание 5");
        int wholeCansOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int allPaintPerClass = whitePaint + brownPaint;
        int classesAtSchool = wholeCansOfPaint / allPaintPerClass;
        int AmountOfWhitePaintPerSchool = classesAtSchool * whitePaint;
        int AmountOfBrownPaintPerSchool = classesAtSchool * brownPaint;
        System.out.println("В школе, где " + classesAtSchool + " классов, нужно " + AmountOfWhitePaintPerSchool +
                " банок белой краски и " + AmountOfBrownPaintPerSchool + " банок коричневой краски");

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
        System.out.println("Задание 6 *");
        int a3 = 12;
        int b3 = 27;
        int c3 = 44;
        int d3 = 15;
        int e3 = 9;
        int result = a3 * (b3 + (c3 - d3 * e3));
        result = result * -1;
        System.out.println("Результат = " + result);
        System.out.println("Задание 7 *");
        int a4 = 5;
        int b4 = 7;
        b4 = b4 - a4;
        a4 = a4 + b4;
        b4 = a4 - b4;
        System.out.println("a = " + a4);
        System.out.println("b = " + b4);
        System.out.println("Задание 8 *");

        int a5 = 456;
        int c5 = (a5 / 10);
        int b5 = c5 - ((c5 / 10) * 10);
        System.out.println("Центральное число = " + b5);

    }


    }
