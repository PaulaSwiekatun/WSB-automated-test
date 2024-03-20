import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Paula test");

        byte value1;
       // value1 = 255;
        byte zmiennaDoRzutowania = (byte) 333;
        System.out.println("Wartosc zmiennej to " + zmiennaDoRzutowania);


        long zmiennaLong;

        byte zmiennaByte;
        short zmiennaShort;
        int zmiennaInt = 128;
       // long zmiennaLong;

        if (zmiennaInt <= 127) {
            System.out.println("zmienna zmiesci sie na typie byte");
        } else {
            System.out.println("zmienna przekroczy zakres byte");
        }


        int temp = 5;

        if (temp <= 0) {
            System.out.println("Załóź czapkę temperatura to " + temp + "stopni");
        } else {
            System.out.println("Życzę słonecznego dnia, temperatura to " + temp);
        }
        String s = "śąć";
        byte b[] = s.getBytes();
        int i = b.length;
        System.out.println("ilosc byte'ow: " + i);

       // String napis = "Cokolwiek: A - Z, a - z, O - 9, ";
        // System.out.println(napis);

        char znak141 = 141;
        char znak142 = '%';

        String napis = "zielony";
        if (napis == "czerwony") {
            System.out.println("stoj");
        } else if (napis == "zielony") {
            System.out.println("jedz");
        } else {
            System.out.println("nie okreslony sygnal");
        }

        int wartosc = 36;
        System.out.println(wartosc);
        wartosc = wartosc + 1;
        System.out.println(wartosc);
        wartosc = wartosc + 1;
        System.out.println(wartosc);

        int wartosc1 = 0;
        System.out.println(++wartosc1);
        //System.out.println(wartosc1);

        int licznik;

      for (licznik = 0; licznik < 10; licznik++) {
          System.out.println("Napisz po raz " + licznik);
      }

      int liczba = 0;

      while (liczba <= 10) {
          System.out.println("COS" + liczba);
          liczba++;
      }

      while (i++ <=10){
          System.out.println("Napisz wyswietl sie po raz " + i);
      }
      int liczba1 = -1;

      while(liczba1-- > 0) {
          System.out.println("Liczba1 to " + liczba1);
      }

      liczba1 = -1;
      do{
          System.out.println("wartosc z petli do - while to " + liczba1);
          liczba1--;
      } while(liczba1 > 0);

      //wprowadzenie do modulo

        int mod = 7;
        System.out.println(mod / 2);
        System.out.println(mod % 2);

        //zadanie
        int max = 101;
        if (max % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Jest to liczba nieparzysta");
        }
      for (int ii = 0; ii < 10; ii++) {
          System.out.println("a");
      }
      boolean sygnalizacja = false;
      boolean zapory = true;

      if (zapory && sygnalizacja) {
          System.out.println("Wszystko działa. Uwaga Pociąg");
      }

        boolean sygnalizacja1 = true;
        boolean zapory1 = true;

        if (zapory) {
            System.out.println("Zapory są opuszczone");
        }

        int przekroczenie = 11;
        if(przekroczenie > 0 && przekroczenie <= 10) {
            System.out.println("Przekraczasz predkosc");
        } else if (przekroczenie > 10) {
            System.out.println("Ostrzezenie zwolnij");

        }
        int [] tablica = new int[10];
        for (int c = 0; c < 10; c++) {
            tablica[c] = c;
            System.out.println("Wartosc biezacej tablicy to " + tablica[c]);
        }
//        String [] tablicaString = new String [7];
//        tablicaString[0] = "poniedzialek";
//        System.out.println(tablicaString[0]);
//        tablicaString[1] = "wtorek";
//        System.out.println(tablicaString[1]);
//
//        String[] miesiace = {"styczen", "luty", "marzec"};
//        System.out.println(miesiace[0]);
//
//        Punkt punkt = new Punkt();
//        System.out.println(punkt.x);
//        punkt.x = 5;
//        System.out.println(punkt.x);
//
//        Punkt punkt1 = new Punkt();
//        System.out.println(punkt1.x);
//
//        punkt1.wyswietlaWspolrzedne();
//        punkt.wyswietlaWspolrzedne();
//
//
//        int polexObiektu = punkt.getX();
//        System.out.println(polexObiektu);


        Punkt punkt2 = new Punkt();
        punkt2.setX(9);
        System.out.println(punkt2.getX());



    }

}
