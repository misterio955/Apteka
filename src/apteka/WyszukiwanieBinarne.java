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
import javax.swing.JOptionPane;

/**
 *
 * @author Basian
 */
public class WyszukiwanieBinarne {
    
    
    //metoda do zliczania wszystkich wersow w pliku z lekarstwami
    public int zliczenieWersow(String sciezka_Pliku) throws IOException {

        FileReader fr = null;
        String linia = "";

        // OTWIERANIE PLIKU:
        try {
            fr = new FileReader(sciezka_Pliku);
        } catch (FileNotFoundException e) {
          
            JOptionPane.showMessageDialog(null, "Brak odpowiedniej scieżki pliku");
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
            JOptionPane.showMessageDialog(null, "Brak odpowiedniej scieżki pliku");
            System.exit(2);
        }
        return Wersy;
    }

     //metoda do wyszukania po ID leku za pomoca wyszukiwania binarnego,
     // w parametrach podajemy sciezke oraz szukane ID
    public ArrayList wyszukanieID(String sciezka, int x) throws IOException {

        int k = zliczenieWersow(sciezka);
        ArrayList<Integer> lista = new ArrayList<>(); 
        ArrayList<String> listaLekow = new ArrayList<>();
        ArrayList<String> wynik = new ArrayList<>();
        
        int l = 0;
        int s;
        int p = k - 1;
        
        String[] first_read = null;

        try (FileReader filereader = new FileReader(sciezka)) {
            BufferedReader buffReader = new BufferedReader(filereader);

            String textLine = buffReader.readLine();
            do {

                first_read = textLine.split(";");
                listaLekow.add(textLine);
                lista.add(Integer.parseInt(first_read[0]));

                textLine = buffReader.readLine();//Czytanie kolejnej lini
            } while (textLine != null);

            while (l <= p) {
                s = (l + p) / 2;    //przeszukiwanie binarne
                
                
                if (lista.get(s) == x) { //jesli wynik jest poprawny dodajemy do listy wynik
                  
                    wynik.add(String.valueOf(listaLekow.get(s)));
                }

                if (lista.get(s) < x) {
                    l = s + 1;
                } else {
                    p = s - 1;
                }
            }
        }
        return wynik; 
    }
  
}