/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apteka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Basian
 */
public class WyszukiwanieBinarne {

    public int zliczenieWersow(String sciezka_Pliku) throws IOException {
        FileReader fr = null;
        String linia = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(sciezka_Pliku);
        } catch (FileNotFoundException e) {
            System.out.println("BŁĄD PRZY OTWIERANIU PLIKU!");
            System.exit(1);
        }

        BufferedReader bfr = new BufferedReader(fr);
        int Wersy = 0;
        // ODCZYT KOLEJNYCH LINII Z PLIKU:
        try {

            while ((linia = bfr.readLine()) != null) {
                Wersy++;   //   SUMOWANIE WERSOW
            }
        } catch (IOException e) {
            System.out.println("BŁĄD ODCZYTU Z PLIKU!");
            System.exit(2);
        }
        return Wersy;
    }
    public void wyszukanieID(String sciezka, int x) throws IOException {

        int k = zliczenieWersow(sciezka);
        ArrayList<Integer> lista = new ArrayList<>();
        //int[] lista = new int[k];
        int l = 0;
        int s;
        int p = k - 1;
        String[] first_read = null;

        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");

                lista.add(Integer.parseInt(first_read[0]));

                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);

            while (l <= p) {
                s = (l + p) / 2;    //przeszukiwanie binarne

                if (lista.get(s) == x) {
                    
                    System.out.println("Odnaleziono element " + x + " pod indeksem " + s);

                    return;
                }

                if (lista.get(s) < x) {
                    l = s + 1;
                } else {
                    p = s - 1;
                }
            }
        }
    }

   

}
