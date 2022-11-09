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


    }
}