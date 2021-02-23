package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        boolean pravda = true;
        boolean nepravda = false;
        int celeCislo = 5;
        long celeCisloVelke = 5L;
        float desatinneSinglePrecision = 5.5F;
        double desatinneDoublePresicion = 5.5;
        char znak = 'a';
        String retazec = "a";

        int podiel = 2/3; // 0
        System.out.println(podiel);

        int poDeleni = 2%3; // 2
        System.out.println(poDeleni);

        float podielDesatinny = 2/3.0f;
        System.out.println(podielDesatinny);

        if (pravda) {
            System.out.println("Pravda");
        }
        else {
            System.out.println("Nepravda");
        }
        int a;
        for (a = 0; a < 5; a++) {
            switch (a) {
                case 1:
                    System.out.println(String.format("a je %d", a));
                    break;
                default:
                    System.out.println("else");
                    break;
            }
        }
        while (a > 0) {
            System.out.println("a je " + a);
            a--;
        }

        System.out.println();
        System.out.println("dva a tri je " + scitaj(2,3));

        System.out.println("Dlzka je: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        int[] mojePole = new int[10];
        for (int i = 0; i < mojePole.length; i++) {
            System.out.println(mojePole[i]);
        }

    }

    static int scitaj(int a, int b) {
        return a + b;
    }

}
