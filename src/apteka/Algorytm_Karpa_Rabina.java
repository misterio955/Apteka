/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Basian
 */
public class Algorytm_Karpa_Rabina {

    private  final int r = 256;   //liczba symboli alfabetu (char 0-255)
    private  final int q = 9551;  //możliwie duża liczba pierwsza  

    public int power_modulo_fast(int a, int b, int m) {
        int i;
        int result = 1;
        long x = a % m;

        for (i = 1; i <= b; i <<= 1) {
            x %= m;
            if ((b & i) != 0) {
                result *= x;
                result %= m;
            }
            x *= x;
        }

        return result % m;
    }

    public void wyszukanieKryteria(String sciezka, String x) throws IOException {

        int m, n, i, j, h1, h2, rm;
        String tekst;
        String wzorzec;

        tekst = "";
        wzorzec = x;
        String[] first_read = null;
        String[] second_read = null;

        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");//Pierwsze rozdzielenie separatorem ";"
                second_read = first_read[3].split(",");//Drugie rozdzielenie seperatorem ","
                for (String item : second_read)//Pętla po elementach tablicy 
                {

                    tekst += item;
                }

                textLine = buffReader.readLine();//Czytanie kolejnej lini

            } while (textLine != null);

            n = tekst.length();
            m = wzorzec.length();
            h2 = 0;
            h1 = 0;
            System.out.println(tekst);

            System.out.println("Indeksy poczatkow wzorca w tekscie");

//      algorytm Hornera do obliczenia funkcji haszujacej h(tekst[1..m])
            for (i = 0; i < m; i++) {
                h2 = ((h2 * r) + tekst.charAt(i));
                h2 %= q;

            }
//      algorytm Hornera do obliczenia funkcji haszujacej h(wzorzec)
            for (i = 0; i < m; i++) {
                h1 = ((h1 * r) + wzorzec.charAt(i));
                h1 %= q;
            }

//      Algorytm KR (Karpa-Rabina)
            rm = power_modulo_fast(r, m - 1, q);
            i = 0;
            while (i < n - m) {
                j = 0;
                if (h1 == h2) {
                    while ((j < m) && (wzorzec.charAt(j) == tekst.charAt(i + j))) {
                        j++;
                    }
                }
                if (j == m) {
                    System.out.println(i + 1);
                }
                h2 = ((h2 - tekst.charAt(i) * rm) * r + tekst.charAt(i + m));
                h2 %= q;
                if (h2 < 0) {
                    h2 += q;
                }
                i++;
            }
            j = 0;
            if (h1 == h2) {
                while ((j < m) && (wzorzec.charAt(j) == tekst.charAt(i + j))) {
                    j++;
                }
            }
            if (j == m) {
                System.out.println(i + 1);
            }
        }
    }
}