public class Main {
    public static void main(String[] args) {
        int a = -555544433;
        System.out.println("Значение переменной a с типом int равно " + a );
        byte b = 115;
        System.out.println("Значение переменной b с типом byte равно " +b);
        short c = 24204;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 1222333444555666777L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float f = 3.1234567f;
        System.out.println("Значение переменной f с типом float равно " + f );
        double g = 4.123456789;
        System.out.println("Значение переменной g с типом double равно " + g );
        System.out.println();

        float f1 = 27.12f;
        long l = 678965549;
        double d1 = 2.786;
        short s = 569;
        short s1 = -159;
        int i =27897;
        byte b1=67;
        System.out.println();

        int lp = 23;
        int as = 27;
        int es = 30;
        int paper = 480;
        int paperSheet = paper/(lp + as + es);
        System.out.println("На каждого ученика рассчитано " + paperSheet + " листов бумаги ");
        System.out.println();

        int bottleMin = 16/2;
        int bottle20Min = bottleMin * 20;
        System.out.println("За 20 минут машина произвела " + bottle20Min + " штук бутылок");
        int bottleDay = bottleMin * 60 * 24;
        System.out.println("За день машина произвела " + bottleDay + " штук бутылок");
        int bottle3Day = bottleDay * 3;
        System.out.println("За 3 дня машина произвела " + bottle3Day + " штук бутылок");
        int bottleMonth = bottleDay * 30;
        System.out.println("За месяц машина произвела " + bottleMonth + " штук бутылок");
        System.out.println();

        int schoolClass = 120/(2+4);
        int brownPaint = schoolClass * 4;
        int whitePaint = schoolClass * 2;
        System.out.println("В школе, где " + schoolClass + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println();

        int banana = 5 * 80;
        double milk = 200*1.05;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        double totalInGrams = banana + milk + iceCream + eggs;
        double totalInKg = totalInGrams/1000;
        System.out.println(totalInGrams +"гр");
        System.out.println(totalInKg + "кг");
        System.out.println();

        int loseKg = 7 * 1000;
        int gramMin = 250;
        int gramMax = 500;
        int dayMin = loseKg/gramMin;
        int dayMax = loseKg/gramMax;
        int dayAvg = ( dayMin + dayMax ) / 2;
        System.out.println(" Для похудения минимум " + dayMax + " дней ");
        System.out.println(" Для похудения максимум " + dayMin + " дней ");
        System.out.println(" Для похудения в среднем " + dayAvg + " дней ");
        System.out.println();

        int masha = 67_760;
        int denis = 83_690;
        int kris = 76_230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int krisYear = kris * 12;
        double mashaIncrease = masha * 1.1;
        double denisIncrease = denis * 1.1;
        double krisIncrease = kris * 1.1;
        double mashaIncreaseYear = mashaIncrease * 12;
        double denisIncreaseYear = denisIncrease * 12;
        double krisIncreaseYear = krisIncrease * 12;
        System.out.println("Маша теперь получает " + mashaIncrease + " рублей. Годовой доход " +
                " вырос на " + (mashaIncreaseYear - mashaYear) + " рублей ");
        System.out.println("Денис теперь получает " + denisIncrease + " рублей." +
                " Годовой доход вырос на " + (denisIncreaseYear - denisYear) + " рублей ");
        System.out.println(" Кристина теперь получает " + krisIncrease + " рублей." +
                " Годовой доход вырос на " + (krisIncreaseYear - krisYear) + " рублей ");


    }
}